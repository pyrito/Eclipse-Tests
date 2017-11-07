
public class BinarySearchTree {
	
	Node root;
	
	
	public BinarySearchTree() {
		root = null;
	}
	
	public int getRoot() {
		return root.getValue();
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public Node insert(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		
		if(root.getValue() > value) {
			root.left = insert(root.left, value);
		}
		
		if(root.getValue() < value) {
			root.right = insert(root.right, value);
		}
		
		return root;
		
	}
	
	public void inOrder() {
		inorderRec(root);
	}
	 public void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.getValue());
	            inorderRec(root.right);
	        }
	    }
	
	private static class Node{
		private Node left;
		private Node right;
		private int value;
		
		public Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
		
		public int getValue() {
			return value;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree test = new BinarySearchTree();
		test.insert(3);
		test.insert(12);
		test.insert(2);
		test.insert(0);
		test.insert(9);
		System.out.println(test.getRoot());
		test.inOrder();
	}
}		
