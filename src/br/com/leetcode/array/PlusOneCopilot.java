package br.com.leetcode.array;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
class PlusOneCopilot {

	public static int[] plusOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;
		return newNumber;
	}

	public static void main(String[] args) {
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 8 };

		int[] result = plusOne(digits);

		// Imprimir o resultado
		System.out.println(Arrays.toString(result));
	}
}
