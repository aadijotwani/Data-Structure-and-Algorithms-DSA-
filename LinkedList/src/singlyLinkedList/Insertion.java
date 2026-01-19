package singlyLinkedList;

public class Insertion {
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next=null;
		}		
	}
	Node head;
	Node temp;
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			temp = newNode;
			return;
		}
		
		temp.next = newNode;
		temp = newNode;	
	}
	
	public void printList() {
		temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		Implementation list = new Implementation();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		
		list.printList();
		
		
		
		
		
	}
}
