/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/

 public class Solution{
	 public List<Integer> findDisappeared(int[] nums){
		 List<Intger> disappeared = new ArrayList<>();
		 
		 //iterate each number in the array, mark its coresponding index number to negative, ex. a number with value of 4 should mark the 4th element in the array to negative
		 //the idea is that all the numbers with coresponding indexes we iterate through in the array should be negative by now, except those do not exit in the array
		 for(int i = 0; i < nums.length; i++){
			 int val = Math.abs(nums[i])-1;
			 if(nums[val] > 0) nums[val] = -nums[val];
		 }
		 
		 //this step is simple, just iterate the array again and find the positive, their indexes are the numbers disappeared in the array
		 for(int i = 0; i < nums.length; i++){
			 if(nums[i] > 0) list.add(i+1);
		 }
		 return disappeared;
	 }
 }