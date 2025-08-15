package com.linkedList.easy.middle;

import com.linkedList.basic.addOrRemovenode.Node;

public class MiddleOfLinkedList {

	public static int middleOfLinkedList(Node head1) {
		Node slow = head1;
		Node fast = head1;
		while (slow != null && fast.next != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
		
	}

	public static void main(String[] args) {
		Node head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);
		head1.next.next.next = new Node(58);
		head1.next.next.next.next = new Node(6);
		System.out.println(middleOfLinkedList(head1));
		

	}

}
