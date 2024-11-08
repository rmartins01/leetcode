package br.com.leetcode.array;

import java.math.BigInteger;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
class PlusOne {
	
    public int[] plusOne(int[] digits) {
    	StringBuilder strDigit = new StringBuilder(); 
        for (int i = 0; i < digits.length; i++) {
        	strDigit.append(digits[i]);
		}
        
        BigInteger newDigit = new BigInteger(strDigit.toString()).add(BigInteger.ONE);
        
        char[] charArrayOfDigits = newDigit.toString().toCharArray();
        int[] returnArray = new int[charArrayOfDigits.length];
        for (int i = 0; i < charArrayOfDigits.length; i++) {
			returnArray[i] = Character.getNumericValue(charArrayOfDigits[i]);
		}
        return returnArray;
        
    }
    


	public static void main(String[] args) {
		System.out.println(new PlusOne().plusOne(new int[] { 1,2,3}));
	}
}
