package chapter1.practice2;

/**
 * 
 * Exercise 1.2: Translate the following expression into prefix form:
	
	5+4+(2−(3−(6+4/5)))
	------------------
	3(6−2)(2−7)
 *
 */
public class Solution {

	public static void main(String[] args) {
		
		System.out.println(5+4+(2-(3-(6+4/5))));
		
		System.out.println((3*(6-2))*(3*(2-7)));
		
		System.out.println(5+4+(2-(3-(6+4/5)))/(3*(6-2))*(3*(2-7)));
	}

}
