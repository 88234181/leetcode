class Node{
	int value;
	Node left;
	Node right;
	
	public Node(int value){
		this.value = value;
		left = null;
		right = null;
	}
}

public class BinarySearchTree{
	private Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	
	public  void insert(int value){
		root = insert(root, value);
	}
	
	public Node insert(Node node, int value){
		if(node == null){
			return (new Node(value));
		}else{
			Node tmp = null;
			if(value < node.value){
				tmp = insert(node.left, value);
				node.left = tmp;
			}else if(value > node.value){
				tmp = insert(node.right, value);
				node.right = tmp;
			}
			
			return node;
		}
	}
	

	public void delete(int toDelete){
		delete(root, toDelete);
	}
	
	public Node delete(Node node, int toDelete){
		if(node == null){
			throw new RunTimeException("cannot delete node");
		}else if(toDelete < node.value){
			node.left = delete(node.left, toDelete);
		}else if(toDelete < node.value){
			node.right = delete(node.right, toDelete);
		}else{
			if(node.left == null){
				return node.right;
			}else if(node.right == null){
				return node.left;
			}else{
				node.value = rightModeValue(node.left);
				delete(node.left, node.value);
			}
		}
	}
	
	public int count(){
		return count(root)
	}
	
	public int count(Node node){
		if(node == null){
			return 0;
		}
		
		int count = 1;
		count += count(node.left);
		count += count(node.right);
		return count;
	}
	
	public boolean isEmpty(){
		return isEmpty(root);
	}
	
	public boolean isEmpty(Node node){
		return count(node) == 0;
	}
	
	public boolean search(int value){
		return search(root, value)
	}
	
	public boolean searhc(Node node, int value){
		if(node == null){
			return false;
		}
		if(node.value == value){
			return true;
		}else if(node.value < value){
			return search(node.left, value);
		}else{
			return search(node.right, value);
		}
	}
	
	public void preOrderTraversal(){
		preOrderTraversal(root);
	}
	
	public void preOrderTraversal(Node node){
		if(node != null){
			System.out.println(node.value);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public void inOrderTraversal(){
		inOrderTraversal(root);
	}
	
	public void inOrderTraversal(Node node){
		if(node != null){
			inOrderTraversal(node.left);
			System.out.println(node.value);
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(){
		postOrderTraversal(root);
	}
	
	public void postOrderTraversal(Node node){
		if(node != null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.value);
		}
	}
	
	private int rightModeValue(Node node){
		while(node.right != null){
			node= node.right;
		}
		return node.value;
	}
	
	private int leftModeValue(Node node){
		while(node.left != null){
			node = node.left;
		}
		return node.value;
	}
}