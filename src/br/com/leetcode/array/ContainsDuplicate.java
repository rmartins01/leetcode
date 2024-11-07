package br.com.leetcode.array;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
class ContainsDuplicate {
	
    public boolean containsDuplicate(int[] nums) {
        
    	for(int i = 0; i < nums.length; i++) {
    		int temp = nums[i];
    		nums[i] = -1;
    		boolean anyMatch = Arrays.stream(nums).anyMatch(value -> value == temp);
    		if(anyMatch) return true;
    	}
    	
    	return false;
    }


	public static void main(String[] args) {
		System.out.println(new ContainsDuplicate().containsDuplicate(new int[] { 1,2,3}));
	}
}
