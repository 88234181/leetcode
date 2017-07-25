/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

public class Solution{
	public String reverseString(String str){
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while(i < j){
			char tmp = arr[i];
			arr[j--] = arr[i];
			arr[i++] = tmp;
		}
		return new String(arr);
	}
}