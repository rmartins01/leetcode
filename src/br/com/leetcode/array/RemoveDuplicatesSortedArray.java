package br.com.leetcode.array;

class RemoveDuplicatesSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int k = 1; // Start with the first element as unique
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}


	public static void main(String[] args) {
		new RemoveDuplicatesSortedArray().removeDuplicates(new int[] { 1, 1, 2 });
	}
}
