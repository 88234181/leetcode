/*
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
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
	Integer prev;
	int maxCount = 0;
	int currentCount = 1;;
	
	public int[] findModes(TreeNode root){
		if(root == null) return new int[0];
		
		List<Integer> modes = new ArrayList<>();
		
		inOrderTraversal(root, modes);
		
		int[] r = new int[modes.size()];
		for(int i = 0; i < r.length; i++){
			r[i] = modes.get(i);
		}
		return r;
	}
	
	//using in order traversal to traverse the tree because we need to check from bottom up. 
	public void inOrderTraversal(TreeNode root, List<Integer> modes){
		if(root == null) return;
		
		inOrderTraversal(root.left, modes);
		
		//compare the previous 
		if(prev != null){
			if(prev != root.val) currentCount = 1;
			else currentCount++;
		}
		
		if(currentCount > maxCount){
			maxCount = currentCount;
			modes.clear();
			modes.add(root.val);
		}else if(currentCount == maxCount){
			modes.add(root.val);
		}
		
		prev = root.val;
		
		inOrderTraversal(root.right, modes);
	}
}