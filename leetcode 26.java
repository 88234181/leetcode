/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
*/

public class Solution{
	public int removeDuplicates(int[] nums){
		int(nums.length < 2) return nums.length; //if the length is 1 or 0, just return the length of the array
		
		int l = 0;
		
		for(int i = 1; i < nums.length; i++){
			if(nums[l] != nums[i]) nums[++l] = nums[i]; //comparing the index with the runner i, if different, update element in the index. attention here, we need to increase the index by 1 first before updating.
		}
		
		return l + 1;
	}
}

//more conscise solution
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        
        for(int n : nums){
            if(l == 0 || n > nums[l-1]) nums[l++] = n; //we skiped the first element since there is no need to compare this. we start comparing the 2nd with the previous element.
        }
        
        return l;
    }
}