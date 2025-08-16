package com.linkedList.easy.ReverseLinkedList;

import java.util.Stack;

import com.linkedList.basic.addOrRemovenode.Node;

public class ReverseOfLL {

	// static Node head;

	public static Node reverseUsingStack(Node head) {

		Node temp = head;
		Stack<Integer> stack = new Stack<>();
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		temp = head;

		while (temp != null) {
			temp.data = stack.pop();
			temp = temp.next;
		}
		return head;
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
		Node head = new Node(30);
		head.next = new Node(45);
		head.next.next = new Node(56);
		head.next.next.next = new Node(58);
		head.next.next.next.next = new Node(6);
		Node headd=reverseUsingStack(head);
		iterate(headd);

	}

}
