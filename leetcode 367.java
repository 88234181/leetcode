/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Returns: True

Example 2:
Input: 14
Returns: False
*/

public class Solution{
	public boolean isSquare(int num){
		int start = 1;
		int end = num;
		
		while(start < end){
			int mid = (start+end)/2;
			
			long mul = mid*mid;
			
			if(mul > num) end = mid - 1;
			else if(mul < num) start = mid + 1;
			else return true;
		}
		
		return false;
	}
}