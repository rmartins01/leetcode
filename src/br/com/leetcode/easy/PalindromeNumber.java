package br.com.leetcode.easy;

/*
 * Example 1:

		Input: x = 121
		Output: true
		Explanation: 121 reads as 121 from left to right and from right to left.
		Example 2:
		
		Input: x = -121
		Output: false
		Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
		Example 3:
		
		Input: x = 10
		Output: false
		Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
		 
		
		Constraints:
		
		-231 <= x <= 231 - 1
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {
		String temp =  new StringBuilder(Integer.valueOf(x).toString()).reverse().toString();
		return temp.equals(Integer.valueOf(x).toString());
	}
}
