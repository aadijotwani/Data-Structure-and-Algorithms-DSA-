package singlyLinkedList;

import java.util.Scanner;

public class Insertion {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static Node head;
	static Node temp;

	public static void insertAtBegining(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			temp = newNode;
			return;
		}
		head = newNode;
		newNode.next = temp;
		temp = newNode;
	}

	public static void insertAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			temp = newNode;
			return;
		}
		temp.next = newNode;
		temp = newNode;
	}

	public static void insertAtPos(int data, int pos) {
		Node newNode = new Node(data);

		if (head == null || pos == 0) {
			head = newNode;
			temp = newNode;
			return;
		}

		temp = head;
		Node tempNode = temp.next;
		int i = 0;
		while (i != pos - 1) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = tempNode;
		tempNode = newNode;
	}

	public static void printlist() {
		temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Insert At Beginning \n2. Insert At End\n3. Insert At Position\n");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			insertAtBegining(10);
			insertAtBegining(20);
			insertAtBegining(30);
			break;

		case 2:
			insertAtEnd(10);
			insertAtEnd(20);
			insertAtEnd(30);
			break;
		case 3:
			insertAtPos(10, 1);
			insertAtPos(20, 1);
			insertAtPos(30, 1);
			insertAtPos(40, 1);
		}
		printlist();
	}
}
