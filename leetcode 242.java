/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/

public class Solution{
	public boolean isAnagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int count = 0;
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
		
		for(int i = 0; i < s.length(); i++){
			count += primes[s.charAt(i)-'a'];
			count -= primes[t.charAt(i)-'a'];
		}
		
		return count == 0;
	}
}