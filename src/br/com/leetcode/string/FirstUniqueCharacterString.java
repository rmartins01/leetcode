package br.com.leetcode.string;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
class FirstUniqueCharacterString {
	
    public int firstUniqChar(String s) {
        
    	char[] charArray = s.toCharArray();
    	for (int i = 0; i < charArray.length; i++ ) {
			int pos = containsChar(charArray[i], charArray);
			if(pos == -1) return i;  
		}
    	
    	return -1;
    }
    
	private int containsChar(char c, char[] charArray) {
		
		int cont = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == c) {
				cont++;
				if(cont>1)
					return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new FirstUniqueCharacterString().firstUniqChar("aabb"));
	}
}
