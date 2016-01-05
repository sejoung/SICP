package chapter1.practice5;

/**
	Exercise 1.5: Ben Bitdiddle has invented a test to determine whether the interpreter he is faced with is using applicative-order evaluation or normal-order evaluation. He defines the following two procedures:
	
	(define (p) (p))
	
	(define (test x y) 
	  (if (= x 0) 
	      0 
	      y))
	      
	Then he evaluates the expression
	
	(test 0 (p))
	What behavior will Ben observe with an interpreter that uses applicative-order evaluation? What behavior will he observe with an interpreter that uses normal-order evaluation? Explain your answer. (Assume that the evaluation rule for the special form if is the same whether the interpreter is using normal or applicative order: The predicate expression is evaluated first, and the result determines whether to evaluate the consequent or the alternative expression.)
 	
 	
 	파이썬 같은 스크립트 언어에서 테스트를 해볼수 있겠음(자바에선 인자로 함수타입을 받을수 없음)
 	
 	
 	호출될 당시에 계산을 하냐 아니면 순서대로 실행을 하냐 이거에 따라서 처음 부터 무한루프에 빠질수 있을것 같음 
 	
 *
 *
 */
public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
	}

	public void p(){
		p();
	}
	
	public void test(int a){
		
	}

}
