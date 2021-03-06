/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:
Input: "Hello, my name is John"
Output: 5
*/

public class Solution{
	public int numberOfSegments(String str){
		String s = str.trim();
		if(s.length() == 0) return 0;
		return s.split("\\s+").length();
	}
}