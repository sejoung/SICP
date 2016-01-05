package chapter1.practice1;

/**
 * Exercise 1.1: Below is a sequence of expressions. What is the result printed by the interpreter in response to each expression? Assume that the sequence is to be evaluated in the order in which it is presented.
	10
	(+ 5 3 4)
	(- 9 1)
	(/ 6 2)
	(+ (* 2 4) (- 4 6))
	(define a 3)
	(define b (+ a 1))
	(+ a b (* a b))
	(= a b)
	(if (and (> b a) (< b (* a b)))
	    b
	    a)
	(cond ((= a 4) 6)
	      ((= b 4) (+ 6 7 a))
	      (else 25))
	(+ 2 (if (> b a) b a))
	(* (cond ((> a b) a)
	         ((< a b) b)
	         (else -1))
	   (+ a 1))
 */
public class Solution {

	public static void main(String[] args) {

		System.out.println(10);

		System.out.println(5 + 3 + 4);

		System.out.println(9 - 1);

		System.out.println(6 / 2);

		System.out.println((2 * 4) + (4 - 6));

		Solution solution = new Solution();

		System.out.println(solution.a() + solution.b() + (solution.a() * solution.b()));

		System.out.println(solution.a() == solution.b());

		if ((solution.b() > solution.a()) && solution.b() < (solution.a() * solution.b())) {
			System.out.println(solution.b());
		} else {
			System.out.println(solution.a());
		}

		if (solution.a() == 4) {
			System.out.println(6);
		} else if (solution.b() == 4) {
			System.out.println(6 + 7 + solution.a());
		} else {
			System.out.println(25);
		}

		System.out.println(2 + solution.c());

		System.out.println(solution.d() * (solution.a() + 1));
		
		/**
		 * console print

		 	10
			12
			8
			3
			6
			19
			false
			4
			16
			5
			16
			
		 **/
	}

	public int a() {
		return 3;
	}

	public int b() {
		return a() + 1;
	}

	public int c() {
		if (a() > b()) {
			return b();
		} else {
			return a();
		}
	}

	public int d() {
		if (a() > b()) {
			return a();
		} else if (a() < b()) {
			return b();
		} else {
			return -1;
		}
	}

}
