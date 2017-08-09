/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
*/

public class Solution{
	public TreeNode convertArrayToBST(int[] nums){
		int l = 0;
		int r = nums.length -1;
		TreeNode root = addNode(nums, l, r);
		return root;
	}
	
	public TreeNode addNode(int[] arr, int l, int r){
		if(l > r) return null;
		int mid = (r - l)/2;
		TreeNode node = new TreeNode(arr[(r-l)/2]);
		
		node.left = addNode(arr, l, mid - 1);
		node.right = addNode(arr, mid + 1, r);
		
		return node;
	}
}