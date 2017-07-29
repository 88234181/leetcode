/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:
Input:
"abccccdd"
Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/

public class Solution{
	public int longestPalidrome(String s){
		if(s == null || s.length() == 0) return 0;
		
		int total = 0;
		int remove = -1;
		
		int[] str = new int[128];
		
		for(char c : s.toCharArray()){
			str[c]++
		}
		
		for(int i : str){
			if(i%2 != 0) remove++;
			total +=i;
		}
		
		return total - (remove == -1?0:remove);
	}
}