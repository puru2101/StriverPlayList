package com.linkedList.basic.addOrRemovenode;

public class Addnode {

	static Node head;

	public static void addNodeStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}
	public static void addNodeLast(int data) {
		Node newNode = new Node(data);
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next=newNode;

	}
	public static void addNodeAfterPosition(int position,int data) {
		Node newNode = new Node(data);
		Node curr = head;
		while (curr.next != null) {
			if(curr.data==position) {
				newNode.next=curr.next;
				curr.next=newNode;
			}
			curr = curr.next;
		}
	}

	public static void iterate() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.print( "null ");
	}

	public static void main(String[] args) {

		head = new Node(30);
		addNodeStart(6);
		addNodeStart(15);
		iterate() ;
		addNodeLast(19);
		addNodeLast(35);

		System.out.println();
		iterate() ;
		System.out.println();
		addNodeAfterPosition(30, 21);
		iterate();


	}

}
