package br.com.leetcode.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
	
class RemoveDuplicatesSortedArrayCopilot {
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
		new RemoveDuplicatesSortedArrayCopilot().removeDuplicates(new int[] { 1, 1, 2 });
	}
}
