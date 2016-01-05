package chapter1.practice3;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.a(1,2,3));
	}
	
	public int a(int a, int b , int c){
		if(a<=b && a>=c){
			return square(b) + square(c);
		}else if (b <= a && b <= c){
			return square(a) + square(c);
		}else{
			return square(a) + square(b);
		}
		
	}
	
	public int square(int a){
		return a*a;
	}
	

}
