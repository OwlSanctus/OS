
public class Stack {

	public Node initialNode;
	
	public Stack() {
		initialNode = null;
	}
	
	public void push(int val) {
		
		// Implement the method.
	}
	
	public int pop() {
		
		// Implement the method.
	}
	
	public String toString() {
		Node current = initialNode;
		String msg = "Stack contains elements: ";
		while(current != null) {
			msg += current.value + " ";
			current = current.next;
		}
		return msg;
	}
	
}
