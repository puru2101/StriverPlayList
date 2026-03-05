package com.linkedList.medium;

import com.linkedList.basic.addOrRemovenode.Node;

public class IntersectionOfLinkedList {

	public static int lengthOfLinkedList(Node head) {

		if (head == null) {
			return 0;
		}
		Node curr = head;
		Integer length = 0;
		while (curr != null) {
			length++;
			curr = curr.next;
		}
		return length;
	}

	public static void intersectionOfLL(Node head1, Node head2) {
		Node curr1 = head1;
		Node curr2 = head2;

		int lenghtLL1 = lengthOfLinkedList(head1);
		int lengthLL2 = lengthOfLinkedList(head2);

		int diff = Math.abs(lengthLL2 - lenghtLL1);

		if (lenghtLL1 < lengthLL2) {
			for (int i = 0; i < diff; i++) {
				curr2 = curr2.next;
			}
		}
		if (lenghtLL1 > lengthLL2) {
			for (int i = 0; i < diff; i++) {
				curr1 = curr1.next;
			}
		}

		while (curr1 != null && curr2 != null) {
			if (curr1 == curr2) {
				System.out.println("Intersection Point  :" + curr1.data);
				break;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}

	}

	public static void intersectionOfLLOptimize(Node head1, Node head2) {
		Node curr1 = head1;
		Node curr2 = head2;

		while (curr1 != curr2) {
			if (curr1 == null) {
				curr1 = head2;
			} else {
				curr1 = curr1.next;
			}

			if (curr2 == null) {
				curr2 = head1;
			} else {
				curr2 = curr2.next;
			}
		}

		if (curr1 != null) {
			System.out.println("Intersection Point : " + curr1.data);
		} else {
			System.out.println("No intersection Point");
		}
	}

	public static void main(String[] args) {
		// Common part
		Node common1 = new Node(8);
		Node common2 = new Node(9);  
		common1.next = common2;

		// List 1
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = common1;

		// List 2
		Node head2 = new Node(5);
		head2.next = new Node(6);
		head2.next.next = common1;

	//	intersectionOfLL(head1, head2);
		intersectionOfLLOptimize(head1, head2);

	}

}
