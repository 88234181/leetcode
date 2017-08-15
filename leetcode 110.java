/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/

public class Solution{
	public boolean isHeightBalanced(TreeNode root){
		if(root == null) return true;
		
		return height(root) != -1;
	}
	
	//instead of returning the actual height, just do DFS and check the different height between sub trees to avoid further searching
	public int height(TreeNode root){
		if(root == null) return 0;
		
		int left = height(root.left);
		if(left == -1) return -1;
		
		int right = height(root.right);
		if(right == -1) return -1;
		
		if(Math.abs(left - right) > 1) return -1;
		
		return Math.max(left, right) + 1;
	}
}