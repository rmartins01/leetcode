package br.com.leetcode.easy;

public class TwoSum {

	public static void main(String[] args) {
		twoSum(new int[]{2,5,5,11}, 10);
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
        for(int i = 0; i < nums.length; i++) {
    		for(int x = 1; x < nums.length; x++) {
        		if(i!=x && nums[i] + nums[x] == target) {
        			return new int[]{i, x};
        		}
        	}	
    	}
        return null;
    }
}
