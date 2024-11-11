package br.com.leetcode.string;

import java.math.BigInteger;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
class ReverseString {
	
    public int reverse(long x) {
    	
    	boolean negative = false;
    	if(x< 0) negative = true;
    		
    	
		StringBuilder reverse = new StringBuilder(Long.valueOf(Math.abs(x)).toString()).reverse() ;
    	
		BigInteger bigInteger = new BigInteger(reverse.toString());
		if(bigInteger.compareTo(BigInteger.valueOf(2147483648l)) > 0  || bigInteger.compareTo(BigInteger.valueOf(-2147483647l)) < 0)
			return 0;
		
		Integer intReverse = bigInteger.intValue();
		if(negative) intReverse = -intReverse;
		
    	return intReverse;
    }
    
	public static void main(String[] args) {
		System.out.println(new ReverseString().reverse(-2147483648));
	}
}
