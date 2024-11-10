package br.com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
class RotateArrayCopilot {
	
	public void rotate(int[] nums, int k) {
	    int length = nums.length;
	    k = k % length;  // Ajustar k se maior que o comprimento do array

	    reverse(nums, 0, length - 1);  // Inverter o array completo
	    reverse(nums, 0, k - 1);       // Inverter a primeira parte
	    reverse(nums, k, length - 1);  // Inverter a segunda parte
	    Arrays.stream(nums).forEach(System.out::println);
	}

	private void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}


    

	public static void main(String[] args) {
		int[] nums = new int[] { -1,-100,3,99};
		new RotateArrayCopilot().rotate(nums, 2);
//		Arrays.stream().forEach(System.out::println); 
	}
}
