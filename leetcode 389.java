/*
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
*/

public class Solution{
	public char findDifference(String s, String t){
		int codeS = 0;
		int codeT = 0;
		for(int i = 0; i < s.length(); i++){
			codeS += s.charAt(i);
			codeT += t.charAt(i);
		}
		codeT += t.charAt(t.length()-1);
		
		return (char) (codeT - codeS);
	}
}

public class Solution{
	public char findDifference(String str1, String str2){
		if(str1.length() == 0) return str2.charAt(0);
		for(int i = 0; i < str1.length()){
			if(str1.charAt(i) != str2.charAt(i)){
				return str2.charAt(i);
			}
		}
		return str2.charAt(str2.length()-1);
	}
}