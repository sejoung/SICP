package chapter1.practice4;

/**
	Observe that our model of evaluation allows for combinations whose operators are compound expressions. Use this observation to describe the behavior of the following procedure:
	
	(define (a-plus-abs-b a b)
	  ((if (> b 0) + -) a b))
 */
public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.aPlusAbsB(1, 2));
	}

	public int aPlusAbsB(int a, int b) {
		if (b > 0) {
			return a + b;
		} else {
			return a - b;
		}
	}

}
