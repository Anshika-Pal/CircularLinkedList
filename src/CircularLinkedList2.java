//Circular Linked List Operation: Insertion at Beginning

class MyCircularLinkedList2 {
	public Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtBegin(int data) {
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
			head = newNode;
		}
	}

	public void printList() {

		if (head == null) {
			System.out.println("Singly Circular Linked List is empty!");
		} else {
			System.out.println("Nodes of Singly Circular Linked List: ");
			// currentNode will point to head
			Node currentNode = head;
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			} while (currentNode != head);
			System.out.println();
		}
	}
}
public class CircularLinkedList2 {
	public static void main(String[] args) {
		MyCircularLinkedList2 list = new MyCircularLinkedList2();
		list.addNodeAtBegin(5);
		list.addNodeAtBegin(9);
		list.addNodeAtBegin(23);
		list.addNodeAtBegin(56);
		list.addNodeAtBegin(3);
		list.printList();
	}
}
