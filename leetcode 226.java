/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
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
 
public class Solution {
	public TreeNode invertBT(TreeNode root){
		invert(root);
		return root;
	}
	
	public void invert(TreeNode root){
		if(root == null) return;
		
		TreeNode tmp = root.left;
		root.left = root.left;
		root.right = tmp;
		
		invert(root.left);
		invert(root.right);
	}
}