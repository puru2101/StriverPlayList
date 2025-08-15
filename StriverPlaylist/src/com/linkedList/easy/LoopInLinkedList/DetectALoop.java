package com.linkedList.easy.LoopInLinkedList;

import com.linkedList.basic.addOrRemovenode.Node;

public class DetectALoop {

	public static void LoopExist(Node head) {
		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("cyclic");
				return;
			}
		}
				System.out.println(" not cyclic");

	}


	public static void main(String[] args) {
		Node head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);
		head1.next.next.next = new Node(58);
		head1.next.next.next.next = new Node(6);
		//head1.next.next.next.next.next = new Node(555);
		head1.next.next.next.next.next = head1;

		LoopExist(head1);
	}

}
