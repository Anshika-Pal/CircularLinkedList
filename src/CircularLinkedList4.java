//Circular Linked List Operation: Deletion from End

class MyCircularLinkedList4{
	public Node head = null;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }
	} 
	public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            head = newNode;
            newNode.next = head;
        }    
        else {    
            //currentNode will point to head    
            Node currentNode = head; 
            while (currentNode.next != head) {
            	currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }    
    } 
	public void deleteNodeFromEnd() {
		//Checks if the list is empty    
        if(head == null) {
        	System.out.println("Nothing to delete.");
        }else if(head.next == head) {
			head=null;
		}else { 
			Node currentNode = head;
			Node previousNode = null;
			while(currentNode.next != head) {   
				previousNode = currentNode;
				currentNode = currentNode.next;
            }
			previousNode.next = head;
		}
    }
    public void printList() {    
        //currentNode will point to head    
        Node currentNode = head;    
            
        if(head == null) {    
            System.out.println("Singly Circular Linked List is empty!"); 
        }else {    
	        System.out.println("Nodes of Singly Circular Linked List: ");    
	        do {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.next;    
	        }while(currentNode != head);
	        System.out.println();
        }
    }   
}
public class CircularLinkedList4 {
	public static void main(String[] args) {
		MyCircularLinkedList4 list=new MyCircularLinkedList4();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(15);
		list.deleteNodeFromEnd();
		list.printList();
	}
}
