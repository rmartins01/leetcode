package br.com.leetcode.string;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
class ReverseInteger {
	
    public void reverseString(char[] s) {
    	int lastIndex = s.length;
    	for (int i = 0; i < s.length/2; i++) {
    		char temp = s[i];
    		--lastIndex;
    		s[i] = s[lastIndex];
    		s[lastIndex] = temp;
		}
    	System.out.println(s);
    }
    
	public static void main(String[] args) {
		new ReverseInteger().reverseString(new char[] {'h','e','l','l','o' });
	}
}
