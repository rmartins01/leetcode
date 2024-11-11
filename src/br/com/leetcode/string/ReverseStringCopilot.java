package br.com.leetcode.string;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
public class ReverseStringCopilot {
    
    public int reverse(long x) {
        boolean isNegative = x < 0;
        StringBuilder reversed = new StringBuilder(Long.toString(Math.abs(x))).reverse();
        
        try {
            int result = Integer.parseInt(reversed.toString());
            return isNegative ? -result : result;
        } catch (NumberFormatException e) {
            return 0; // Retorna 0 se o valor invertido estiver fora do intervalo de int
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStringCopilot().reverse(-2147483648L));
        System.out.println(new ReverseStringCopilot().reverse(1234567890L));
        System.out.println(new ReverseStringCopilot().reverse(10000000003L)); // Caso que excede o limite de int
    }
}
