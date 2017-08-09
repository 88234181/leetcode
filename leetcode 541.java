/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/

public class Solution{
	public String reverseStringEveryK(String str, int k){
		char arr = str.toCharArray();
		int i = 0;
		int n = str.length();
		while(i < n){
			int tmp = Math.min(i+k-1; n-1);
			swap(str, i, tmp);
			i += 2*k;
		}
		
		return new String(arr);
	}
	
	public void swap(char[] str, int i, int j){
		while(i < j){
			char tmp = str[i];
			str[i++] = str[j];
			str[j--]= tmp;
		}
	}
}