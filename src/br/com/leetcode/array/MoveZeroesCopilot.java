package br.com.leetcode.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
class MoveZeroesCopilot {
	
    public void moveZeroes(int[] nums) {
        
    	int addZeros = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == 0) {
    			nums[i] = findNumberDifZero(nums, i);
    			if(nums[i]!= 0)
    				addZeros++;
    			
    			shiftLeftAllNums(nums, i+1);
    		}
    	}
    	
    	int indexZeroes = nums.length-1;
    	for (int i = 0; i < addZeros; i++) {
    		nums[indexZeroes] = 0;
    		indexZeroes--;
		}
    	
    }


	private void shiftLeftAllNums(int[] nums, int startIndex) {
		
		for (int j = startIndex; j < nums.length; j++) {
			int indexNext = j+1;
			if(indexNext < nums.length) {
				nums[j] = nums[indexNext];
			}
		}
	}


	private int findNumberDifZero(int[] nums, int startIndex) {
		for (int i = startIndex; i < nums.length; i++) {
			if(nums[i] != 0) {
				int ret = nums[i];
				nums[i] = 0;
				return ret;
			}
		}
		return 0;
	}


	public static void main(String[] args) {
		new MoveZeroesCopilot().moveZeroes(new int[] {4,2,4,0,0,3,0,5,1,0});
	}
}
