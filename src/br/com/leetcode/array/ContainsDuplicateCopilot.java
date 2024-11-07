package br.com.leetcode.array;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
class ContainsDuplicateCopilot {
	
    public boolean containsDuplicate(int[] nums) {
    	return Arrays.stream(nums).distinct().count() != nums.length;
    }


	public static void main(String[] args) {
		System.out.println(new ContainsDuplicateCopilot().containsDuplicate(new int[] { 1,2,3}));
	}
}
