/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
*/

//trailing zeros are made by factor 2*5, in factorial we always have 2 before 5, so we just could the factor 5.
//pay attention here, some number has more than one 5 factor, for example, 25. so we need to keep dividing n by 5 and count how many 5s are there.
public class Solution{
	public int trailingZeros(int n){
		int res = 0;
		while(n != 0){
			n = n/5;
			res += n;
		}
		return res;
	}
}