import java.util.ArrayList;

public class Node {
	private String id;
	private ArrayList<Node> children;

	
	public Node(String id) {
		children = new ArrayList<Node>();
		this.id = id;
	}
	
	public Node insert(Node parent, String name) {
		Node temp = new Node(name);
		parent.children.add(temp);
		return temp;
	}
	
	public void printTree(Node parent) {
		System.out.println(parent.id);
		for(Node things : parent.children) {
			printTree(things);
		}
	}
	
	public int getHeight(Node parent) {
		if(parent == null) {
			return 0;
		}
		
		int h = 0;
		
		for(Node child : parent.children) {
			h = Math.max(h, getHeight(child));
		}
		
		return h+1;
	}
	
	public boolean trackOfPath(Node root, Node child, ArrayList<String> path) {
		if(root == null) {
			return false;
		}
		
		path.add(root.id);
		
		if(root.id.equals(child.id)) {
			return true;
		}
		
		for(Node kids : root.children) {
			if(trackOfPath(kids, child, path)) {
				return true;
			}
		}
		
		path.remove(path.size() - 1);
		return false;
	}
}
