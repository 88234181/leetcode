/*
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.

Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution{
	public boolean isSubtree(TreeNode root, TreeNode sub){
		if(root == null) return false;
		if(isSameTree(root, sub)) return true;
		return isSubtree(root.left, sub) || isSubtree(root.right, sub);
	}
	
	public boolean isSameTree(TreeNode root, TreeNode node){
		if(root == null && node == null) return true;
		else if(root == null && node != null) return false;
		else if(root != null && node == null) return false;
		else if(root.val != node.val) return false;
		return isSameTree(root.left, node.left) && isSameTree(root.right, node.right);
	}
}