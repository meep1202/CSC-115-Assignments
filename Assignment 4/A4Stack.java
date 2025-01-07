// public class A4Stack<T> implements Stack<T> {
	
// 	private A4Node<T> head;
// 	// Do NOT add any other fields to this class.
// 	// You should be able to implement the Stack 
// 	// interface with just a head field.

// 	public A4Stack() {
// 		head = null;
// 	}
	
// 	public void push(T value) {
// 		A4Node<T> node = new A4Node<T>(value);
// 		if (head == null) {
// 			head = node;
// 		}
// 		else {
// 			node.setNext(head);
// 			head = node;
// 		}
// 	}
	
// 	public T pop() {
// 		if (this.isEmpty()) {
// 			return null;
// 		}
// 		T info = this.peek();
// 		head = head.next;
// 		return info;
// 	}
	
// 	public void popAll() {
// 		while (head.next != null) {
// 			this.pop();
// 		}
// 	}
	
// 	public boolean isEmpty() {
// 		return (head == null);
// 	}
	
// 	public T peek() {
// 		return head.getData();
// 	}
	
// 	// Implemented for you for debugging purposes
// 	public String toString() {
// 		String result = "{";
// 		String separator = "";
		
// 		A4Node<T> cur = head;
// 		while (cur != null) {
// 			result += separator + cur.getData().toString();
// 			separator = ", ";
// 			cur = cur.next;
// 		}
	
// 		result += "}";
// 		return result;
// 	}
// }