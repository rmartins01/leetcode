package br.com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
class IntersectionTwoArraysII {
	
    public int[] intersect(int[] nums1, int[] nums2) {
    	
        if(nums1.length < nums2.length ) {
        	return compare(nums1, nums2);
        }else {
        	return compare(nums2, nums1);
        }
    }
    
	private int[] compare(int[] nums1, final int[] nums2) {
		
		ArrayList<Integer> tempArray = new ArrayList<>();
		Arrays.sort(nums2);
		int lastIndexFoundedValue = 0;
		for(int i =0; i < nums1.length; i++) {
			
			int indexRepetedValue = Arrays.binarySearch(nums2,  nums1[i]);
			if(indexRepetedValue > -1) {
				int repeatedValue = nums2[indexRepetedValue];
				
				tempArray.add(nums2[indexRepetedValue]);
			}
		}
		
		return tempArray.stream().mapToInt(Integer::intValue).toArray();
	}



	public static void main(String[] args) {
		
		Arrays.stream(new IntersectionTwoArraysII().intersect(new int[] {1,2,2,1},new int[] {2,2})).forEach(System.out::println);
	}
}
