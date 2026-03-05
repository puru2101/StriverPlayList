package com.linkedList.easy;

import com.linkedList.basic.addOrRemovenode.Node;

public class DeleteNodeFromNEnd {

	public static Node deleteFromNEnd(Node n1, int k) {
		Node temp = new Node(-2);
		temp.next = n1;
		Node fast = temp;
		Node slow = temp;

		for (int i = 0; i <= k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return temp.next;
	}

	public static void printNode(Node n1) {
		Node curr = n1;
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		if (curr == null) {
			System.out.print("null");
		}
	}

	public static void main(String[] args) {

		Node head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);
		head1.next.next.next = new Node(58);
		head1.next.next.next.next = new Node(6);
		Node h2 = deleteFromNEnd(head1, 2);
		printNode(h2);

	}

}
