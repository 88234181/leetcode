public class CheckBST{
	class Node{
		int data;
		Node left;
		Node right;
	}
	boolean checkBST(Node root){
		
		if(root == null){
			return true;
		}
		
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	boolean checkBST(Node root, int min, int max){
		if(root == null){
			return true;
		}
		
		if(root.value < min || root.value > max){
			return false;
		}
		
		return checkBST((root.left, min, root.value - 1) && checkBST(root.right, root.value + 1, max));
	}
}