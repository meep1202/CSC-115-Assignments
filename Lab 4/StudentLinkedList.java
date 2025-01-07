public class StudentLinkedList implements StudentList {

	StudentNode head;
	int count;

	public StudentLinkedList() {
		head = null;
		count = 0;
	}

	public void add(Student s) {
		StudentNode node = new StudentNode(s, head);
		if (head == null) {
			head = node;
		}
		else {
			StudentNode curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = node;
		}
		node.next = null;
		count++;
	}

	public int size() {
		return count;
	}

	public void removeFront() {
		if (head != null) {
			if (head.next == null) {
				head = null;
			}
			else {
				head = head.next;
			}
			count--;
		}
	}

	public boolean contains(Student s) {
		if (head == null) {
			return false;
		}
		StudentNode temp = head;
		if (temp.getData().equals(s)) {
			return true;
		}
		while (temp.next != null) {
			temp = temp.next;
			if (temp.getData().equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Purpose: returns a String reprensentation of elements
	 *      in this list separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		// DO NOT CHANGE THIS METHOD - it is correct
		// Changing it will result in your code getting
		// a score of 0 from the autograder for this lab
		
		String s = "";
		StudentNode tmp = head;

		while(tmp != null) {
			s  += tmp.getData() + "\n";
			tmp = tmp.next;
		}

		return s;
	}
}
