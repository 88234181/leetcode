/*
Given an integer, write a function to determine if it is a power of two.
*/

public class Solution{
	public boolean isPowerOfTwo(int num){
		return n > 0 && n == (n & -n);
	}
}