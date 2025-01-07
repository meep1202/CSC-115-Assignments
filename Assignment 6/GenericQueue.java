public class GenericQueue<T> implements Queue<T> {

	private Node<T> front;
	private Node<T> back;
	// no numElements for this implementation

	public GenericQueue() {
		front = null;
		back = null;
	}

	public int size() {
		int count = 0;
		Node<T> cur = front;
		
		while (cur != null) {
			count++;
			cur = cur.getNext();
		}
		return count;			
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void enqueue (T value) {
		Node<T> n = new Node<T>(value);
		if (front == null) {
			front = n;
		} else {
			back.setNext(n);
		}
		back = n;
	}

	public T dequeue() throws QueueEmptyException {
		try {
			T val = front.getValue();
			front = front.getNext();
			if (front == null) {
				back = null;
			}
			return val;
		}
		catch (Exception NullPointerException) {
			throw new QueueEmptyException();
		}
	}

	public T peek() throws QueueEmptyException  {
		try {
			return front.getValue();
		}
		catch (Exception NullPointerException) {
			throw new QueueEmptyException();
		}
	}

	public void makeEmpty() {
		front = null;
		back = null;
	}
}