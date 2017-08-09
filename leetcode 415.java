/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:
The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

public class Solution{
	public String addNumber(String num1, String num2){
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int j = num1.length()-1, k = num2.length()-1; j >= 0 || k >= 0; j--, k--){
			int x = j < 0 ? 0 : num1.charAt(j)-'0';
			int y = k < 0 ? 0 : num2.charAt(k)-'0';
			sb.append((x+y+carry)%10);
			carry = (x+y+carry)>9?1:0;
		}
		
		if(carry == 1) sb.append(1);
		
		return sb.reverse().toString();
	}
}