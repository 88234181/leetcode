/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/

public class Solution{
	public int[] intersectionOfArrays(int[] nums1, int[] nums2){
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums1){
			set.add(num);
		}
		
		List<Integer> list = new ArrayList<>();
		
		for(int num : nums2){
			if(set.contains(num)) {
				list.add(num);
				set.remove(num);
			}
		}
		
		return list.toArray(new int[list.size()]);
	}
}