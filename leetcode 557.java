/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/

public class Solution{
	public String reverseWords(String str){
		char[] strArr = str.toCharArray();
		for(int i = 0; i < strAtt.length; i++){
			int j = i;
			while(j < strArr.length && strArr[j] != ' ') j++;
			reverse(strArr, i, j);
			i = j;
		}
		return new String(strArr);
	}
	
	public void reverse(char[] arr, int i, int j){
		while(i < j){
			char temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}
}
