/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
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
	public List<List<Integer>> levelOrderTraversal(TreeNode root){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		traversal(list, root, 0);
		return list;
	}
	
	public void traversal(List<List<Integer>> list, TreeNode node, int level){
		if(node == null) return;
		
		if(level >= list.size()) list.add(0, new ArrayList<Integer>());
		
		traversal(list, node.left, level + 1);
		traversal(list, node.right, level + 1);
		
		list.get(list.size() - level - 1).add(node.val);
	}
}