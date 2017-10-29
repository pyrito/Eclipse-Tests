import java.util.ArrayList;
import java.util.Arrays;

public class TreeNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node("root");
		Node n2 = new Node("first");
		Node second = n1.insert(n1, "second");
		Node lol = n1.insert(n1, "lol");
		ArrayList<String> path = new ArrayList<String>();
		n1.insert(lol, "ayy lmao");
		n1.insert(second, "third");
		//n1.printTree(n1);
		n1.trackOfPath(n1, second, path);
		
		for(String id : path) {
			System.out.println(id);
		}
		
	}

}
