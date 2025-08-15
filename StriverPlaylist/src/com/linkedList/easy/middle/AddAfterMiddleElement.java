package com.linkedList.easy.middle;

import com.linkedList.basic.addOrRemovenode.Node;

public class AddAfterMiddleElement {

	public static void deleteMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;
		Node middle = null;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		middle = slow;
		System.out.println(middle.data);
		Node curr=head;
		while(curr.next!=null) {
			if(curr.next.data==middle.data) {
				curr.next=curr.next.next;
			}
			curr=curr.next;
		}
	}

	public static void iterate(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.print("null ");
	}

	public static void main(String[] args) {
		Node head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);
		head1.next.next.next = new Node(58);
		head1.next.next.next.next = new Node(6);
		deleteMiddleElement(head1);
		iterate(head1);
	}
}
