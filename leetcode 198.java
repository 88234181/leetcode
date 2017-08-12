/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

public class Solution{
	public int rob(int[] houses){
		
		int prevRob = 0; // max money if rob current house
		int prevNotRob = 0; // max money if did not rob current house
		
		//iterate the array, we keep two counts, 1) we rob the house 2) we did not rob the house
		for(int n : houses){
			int curRob = prevNotRob + n; //if current house is robbed, it is equal to the current house value and the value for prev hoouse didnt robbed
			int curNotRob = Math.max(prevNotRob, prevRob); //if the current house is not robbed, it is the max between the prev house robbed and not robbed
			
			//update values
			prevRob = curRob;
			prevNotRob = curNotRob;
		}
		
		return Math.max(prevNotRob, prevRob);
	}
}