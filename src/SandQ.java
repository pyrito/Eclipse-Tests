
public class SandQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		s1.push(12);
		s1.push(13);
		s1.push(1221);
		s1.push(10);
		System.out.println(s1);

	}
	
	static class Stack{
		private static class Node{
			private int data;
			private Node next;
			private Node(int data) {
				this.data = data;
			}
		}
		
		public Node top;
		public int counter; 
		
		public boolean isEmpty() {
			return top == null;
		}
		
		public int peek() {
			int data = top.data;
			if(top == null) {
				return -1;
			}
			return data;
		}
		
		public void push(int d) {
			Node temp = new Node(d);
			temp.next = top;
			counter++;
			top = temp;
		}
		
		public int pop() {
			int data = top.data;
			if(top == null) {
				return -1;
			}
			top = top.next;
			counter--;
			return data;
		}
		
		public String toString() {
			String fin = "";
			Node tempTop = top;
			for(int n = 0; n < counter && tempTop != null; n++) {
				fin += tempTop.data + " ";
				tempTop = tempTop.next;
			}
			return fin;
		}
	}
	
	static class Queue{
		private static class Node{
			private int data;
			private Node next;
			private Node(int data) {
				this.data = data;
			}
		}
		
		public Node head;
		public Node tail;
		
		public boolean isEmpty() {
			return head == null;
		}
		
		public int peek() {
			if(head == null) {
				return -1;
			}
			return head.data;
		}
		
		public void add(Node d) {
			if(tail != null) {
				tail.next = d;
			}
			tail = d;
			
			if(head == null) {
				head = d;
			}
		}
		
		public int remove() {
			int data = head.data;
			if(head.next == null) {
				tail = null;
			}
			
			head = head.next;
			return data;
		}
	}
}
