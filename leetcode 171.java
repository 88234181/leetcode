/*
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/

public class Solution{
	public int titleToNumber(String s){
		char[] arr = s.toCharArray();
		int col = 0;
		int count = 0;
		for(char c : arr){
			col *= 26;
			col += (int) c - 'A' +1;
		}
		return col;
	}
}