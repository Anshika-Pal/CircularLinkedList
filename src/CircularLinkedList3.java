//Circular Linked List Operation: Insertion after Specific Node Value of Linked List

class MyCircularLinkedList3 {
	public Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			// currentNode will point to head
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next = head;
		}
	}

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		// Create a new node
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("Singly Circular Linked List is empty!");
		} else {
			Node currentNode = head;
			Node locationNode = null;
			do {
				int value = currentNode.data;
				if (value == locationValue) {
					locationNode = currentNode;
					break;
				}
				currentNode = currentNode.next;
			} while (currentNode != head);
			if (locationNode == null) {
				System.out.println("Location Value does not exist.");
			} else {
				newNode.next = locationNode.next;
				locationNode.next = newNode;
			}
		}
	}

	public void printList() {
		// currentNode will point to head
		Node currentNode = head;

		if (head == null) {
			System.out.println("Singly Circular Linked List is empty!");
		} else {
			System.out.println("Nodes of Singly Circular Linked List: ");
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			} while (currentNode != head);
			System.out.println();
		}
	}
}

public class CircularLinkedList3 {
	public static void main(String[] args) {
		MyCircularLinkedList3 list = new MyCircularLinkedList3();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAfterSpecificNodeValue(23, 3);
		list.printList();
	}

}
