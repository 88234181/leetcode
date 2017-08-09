/*
We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.

Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

Example 1:
Input: [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].
Note: The length of the input array will not exceed 20,000.
*/

public class Solution{
	public int longestHarmoniousSubsequence(int[]  arr){
		int longest = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr){
			map.put(num, map.getOrDefault(num, 0)+1);
			if(map.containsKey(num-1)) longest = Math.max(longest, map.get(num) + map.get(num-1));
			if(map.containsKey(num+1)) longest = Math.max(longest, map.get(num) + map.get(num+1));
		}
		
		return longest;
	}
}