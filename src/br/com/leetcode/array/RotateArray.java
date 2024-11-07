package br.com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
class RotateArray {
	
    public int[] rotate(int[] nums, int k) {

    	List<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toList());
    	
    	for(int i = 0; i < k; i++) {
    		collect.add(0, collect.get(collect.size()-1));
    		collect.remove(collect.size()-1);
    	}
    	
    	nums = collect.stream().mapToInt(Integer::intValue).toArray();
    	
    	return nums;
    }
    

	public static void main(String[] args) {
		int[] nums = new int[] { 1,2,3,4,5,6,7};
		Arrays.stream(new RotateArray().rotate(nums, 3)).forEach(System.out::println); 
	}
}
