/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

public class Solution{
	public int maxSubArray(int[] nums){
		int max = nums[0];
		int leftEnd = nums[0]; // the element on the left end that yields the max value, initially set to the first element
		
		for(int i = 1; i < nums.length; i++){
			leftEnd = Math.max(leftEnd + nums[i], nums[i]);
			max = Math.max(max, leftEnd);
		}
		
		return max;
	}
}