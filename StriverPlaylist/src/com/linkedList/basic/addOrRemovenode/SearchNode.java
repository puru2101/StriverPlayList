package com.linkedList.basic.addOrRemovenode;

public class SearchNode {
	static Node head1;

	public static void searchNode(int data) {
		Node node = new Node(data);
		int count = 0;
		Node curr = head1;
		while (curr != null) {
			if (curr.data == node.data) {
				System.out.println(curr.data + " at position " + count);
				return;
			}
			curr = curr.next;
			count++;
		}
		System.out.println(node.data + " Not exist");
	}

	public static void main(String[] args) {
		head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);
		head1.next.next.next = new Node(58);
		head1.next.next.next.next = new Node(6);
		searchNode(56);
	}

}
