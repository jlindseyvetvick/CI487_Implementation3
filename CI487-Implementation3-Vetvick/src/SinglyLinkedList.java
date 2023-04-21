//Implementation # - Singly Linked List
//Lindsey Vetvick - CI487

public class SinglyLinkedList<E> {

	static class ListNode<E> {

		public E data;
		public ListNode<E> next;

		public ListNode(E data) {
			this.data = data;
			this.next = null;
		}
	}

	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;

	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	/* Case 1: we have to add the thing to the head */
	public void addToFront(E data) {
		ListNode<E> newNode = new ListNode<>(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	/* Case 2: we have to add the thing to the tail */
	public void addToEnd(E data) {
		ListNode<E> newNode = new ListNode<>(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public ListNode<E> getNodeAtPosition(int pos) throws IndexOutOfBoundsException {
		if (pos > size - 1 || pos < 0) {
			throw new IndexOutOfBoundsException();
		}

		ListNode<E> tmp = head;

		for (int i = 0; i < pos; i++) {
			tmp = tmp.next;
		}
		return tmp;
	}

	/* Create a function that adds new nodes to the singly linked list */
	public void addNodeAtPosition(int pos, E data) throws IndexOutOfBoundsException {
		if (pos > size || pos < 0) {
			throw new IndexOutOfBoundsException();
		}

		if (pos == 0) {
			addToFront(data);
		}

		else if (pos == size) {
			addToEnd(data);
		}

		else {
			ListNode<E> curr = getNodeAtPosition(pos);
			ListNode<E> prev = getNodeAtPosition(pos - 1);
			ListNode<E> newNode = new ListNode<>(data);
			prev.next = newNode;
			newNode.next = curr;
			size++;
		}
	}

	/* Case 1: we have to remove the thing to the head */
	public void removeFromFront() throws IndexOutOfBoundsException {
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		}

		if (head == tail) {
			head = null;
			tail = null;
		}

		else {
			ListNode<E> tmp = head;
			head = head.next;
			tmp.next = null;
		}
		size--;
	}

	/* Case 2: we have to remove the thing to the tail */
	public void removeFromEnd() throws IndexOutOfBoundsException {
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		}

		if (head == tail) {
			head = null;
			tail = null;
		} else {
			ListNode<E> tmp = getNodeAtPosition(size - 2);

			tmp.next = null;
			tail = tmp;
		}
		size--;
	}

	/* Create a function that removes specific nodes from the singly linked list */
	public void removeNodeAtPosition(int pos) throws IndexOutOfBoundsException {
		if (pos > size - 1 || pos < 0) {
			throw new IndexOutOfBoundsException();
		}

		if (pos == 0) {
			removeFromFront();
		}

		else if (pos == size - 1) {
			removeFromEnd();
		}

		else {
			ListNode<E> curr = getNodeAtPosition(pos);
			ListNode<E> prev = getNodeAtPosition(pos - 1);
			prev.next = curr.next;
			curr.next = null;
			size--;
		}
	}

	/**/
	public boolean isEmpty() {
		return size == 0;
	}

	/**/
	public int size() {
		return size;
	}

	/*
	 * Creates a function that prints the contents of a linked list
	 */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		ListNode<E> t = head;
		while (t != null) {
			s.append(t.data.toString() + " --> ");
			t = t.next;
		}
		s.append("null");

		return s.toString();
	}

}
