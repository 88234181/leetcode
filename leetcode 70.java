/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.
*/


// this is actually a fibonacci question
public class Solution{
	public int climbStair(int n){
		if(n < 2) return 1;
		
		int a = 2;
		int b = 1;
		
		for(int i = 2; i < n; i++){
			a = a + b;
			b - a - b;
		}
		
		return a;
	}
}