/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False

Example 3:
Input: "abcabcabcabc"
Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/


public class Solution{
	public isRepeatedSubstring(String s){
		for(int i = 1; i < s.length()/2;i++){
			String sub = s.substring(0,i);
			for(int j = i; j < s.length(); j += i){
				int gap = Math.min(j+i, s.length());
				String rep = s.substring(j, gap);
				if(!sub.equal(rep)) break; //not returning false yet because there might be a diferent substring can make this string
				else if(j+i == s.length()) return true; //when it pass the first if condition and reaches the end of the string, it must be able to build up the string
				
			}
		}
		return false; //when all substring cannot build this string
	}
}