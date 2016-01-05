package chapter1.practice4;

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
