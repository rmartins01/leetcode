package br.com.leetcode.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;

		// Move todos os elementos não-zero para a frente
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroIndex++] = nums[i];
			}
		}

		// Preenche o restante do array com zeros
		for (int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		// Imprimir o array modificado
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
