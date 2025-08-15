package com.linkedList.basic.addOrRemovenode;

public class DeleteNode {

	static Node head1;

	public static void deleteFromStart() {
		if (head1.next == null) {
			System.out.println("null");
		}
		head1 = head1.next;

	}

	public static void deleteFromLast() {
		if (head1.next == null) {
			System.out.println("null");
		}
		Node curr = head1;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;

	}

	public static void deleteFromPosition(int poition) {
		if (head1.next == null) {
			System.out.println("null");
		}
		Node curr = head1;
		while (curr.next != null) {

			if (curr.data == poition) {
				curr.next = curr.next.next;
			}
			curr = curr.next;
		}
	}

	public static void iterate() {
		Node curr = head1;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.print("null ");
	}

	public static void main(String[] args) {

		head1 = new Node(30);
		head1.next = new Node(45);
		head1.next.next = new Node(56);

		// deleteFromStart();
		//deleteFromLast();
		deleteFromPosition(30);
		iterate();

	}

}
