/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
*/

public class Solution{
	public boolean isPowerOfThree(int num){
		return (Math.log10(num)/Math.log10(3)) % 1 == 0;
	}
}