package com.medium.doublyLL;

public class TestNode {

	public static Node addStart(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}

		newNode.next = head;
		head.previous = newNode;

		return newNode;
	}

	public static Node addLast(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		newNode.previous = curr;
		return head;
	}

	public static Node removeHead(Node head) {
		if (head == null) {
			return null;
		}
		Node newHead = head.next;
		newHead.previous = null;
		head.next = null;
		return newHead;
	}

	public static Node removeLast(Node head) {
		if (head == null) {
			return null;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.previous.next = null;
		curr.previous = null;

		return head;
	}

	static void printLL(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " <--> ");
			curr = curr.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		Node node1 = addStart(head, 11);
		Node node2 = addStart(node1, 12);
		Node node3 = addStart(node2, 13);
		printLL(node3);
		System.out.println();
		System.out.println("---------------------------------------");
		Node head1 = new Node(10);
		head1 = addLast(head1, 11);
		head1 = addLast(head1, 12);
		head1 = addLast(head1, 13);
		printLL(head1);
		System.out.println();
		System.out.println("---------------------------------------");
		Node head3 = new Node(10);
		Node node31 = addStart(head3, 11);
		Node node32 = addStart(node31, 12);
		Node node33 = addStart(node32, 13);
		Node node34=removeHead(node33);
		Node node35= removeLast(node34);
		printLL(node35);
		
		

	}

}
