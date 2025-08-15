package com.linkedList.basic.addOrRemovenode;

public class LengthOfLinkedList {

	static Node head1;

	public static int lengthOfLinkedList() {
		int count = 0;
		Node curr = head1;
		while (curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);
		head1.next.next.next = new Node(58);
		head1.next.next.next.next = new Node(6);
		System.out.println(lengthOfLinkedList());
	}

}
