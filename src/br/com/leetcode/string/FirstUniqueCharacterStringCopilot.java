package br.com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
class FirstUniqueCharacterStringCopilot {

	public int firstUniqChar(String s) {
		Map<Character, Integer> charCount = new HashMap<>();

		// Contar as ocorrências de cada caractere
		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		// Encontrar o índice do primeiro caractere único
		for (int i = 0; i < s.length(); i++) {
			if (charCount.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1; // Nenhum caractere único encontrado
	}

	public static void main(String[] args) {
		FirstUniqueCharacterStringCopilot rs = new FirstUniqueCharacterStringCopilot();
		System.out.println(rs.firstUniqChar("leetcode")); // Deve retornar 0
		System.out.println(rs.firstUniqChar("loveleetcode")); // Deve retornar 2
		System.out.println(rs.firstUniqChar("aabb")); // Deve retornar -1
	}
}
