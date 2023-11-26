//Circular Linked List Operation: Insertion at End

class MyCircularLinkedList1{
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
    public void printList() {  
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else {    
	        System.out.println("Nodes of singly circular linked list: ");
	        Node currentNode = head;      
	        do {    
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.next;    
	        } while(currentNode!=head);   
	        System.out.println();
        }
    }   
}
public class CircularLinkedList1 {
	public static void main(String[] args) {
		MyCircularLinkedList1 list=new MyCircularLinkedList1();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(67);
		list.addNodeAtEnd(34);
		list.addNodeAtEnd(6);
		list.printList();
	}
}
