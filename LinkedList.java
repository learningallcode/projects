// Class to implement LinkedList

public class LinkedList<T> {
	/* inner class to define node */
	
	private class Node<T> {
		private T data;
		private Node<T> next;
		public Node (T val) {
			this.data = val;
			this.next = null;
		}
	}
	public Node<T> root;
	
	//methods to act on the nodes
	/* Is it a good design principle to have methods
	 in the LinkedList class vs the node class ? */
	public LinkedList(T init) {
		root = new Node<T> (init);
	}
	
	public void addNode(T val) {
		// add to the end of the list
		Node<T> tmp1 = root;
		Node<T> tmp = new Node<T> (val);
		while(tmp1.next != null) {
			tmp1 = tmp1.next;
		}
		tmp1.next = tmp;
	}
	
	public void delNode(T val) {
		/* traverse to the node and make prev
		point to curr's next */
		Node<T> prev, curr;
		curr = root;
		prev = null;
		while(curr != null && curr.data != val) {
			prev = curr;
			curr = curr.next;
		}
		if (curr != null) {
			prev.next = curr.next;
		}
	}
	
	public void display() {
		Node<T> tmp = root;
		while(tmp != null) {
			System.out.println("The data is " + tmp.data + "\n");
			tmp = tmp.next;
		}
	}
	
}
