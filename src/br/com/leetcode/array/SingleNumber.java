package br.com.leetcode.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
class SingleNumber {
	
    public int singleNumber(int[] nums) {
        int numReturn = 0;
    	for (int i : nums) {
    		numReturn ^= i;
        	
        }
    	return numReturn;
    }
    

	public static void main(String[] args) {
		System.out.println(new SingleNumber().singleNumber(new int[] { 4,1,2,1,2}));
	}
}
