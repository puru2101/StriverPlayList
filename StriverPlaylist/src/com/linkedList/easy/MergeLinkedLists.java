package com.linkedList.easy;

import com.linkedList.basic.addOrRemovenode.Node;

public class MergeLinkedLists {

	public static Node mergeList(Node n1, Node n2) {
		Node temp = new Node(1);
		Node curr = temp;

		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				curr.next = n1;
				n1 = n1.next;
			} else {
				curr.next = n2;
				n2 = n2.next;
			}
			curr = curr.next;
		}

		if (n1 != null) {
			curr.next = n1;
		} else {
			curr.next = n2;
		}

		return temp.next;
	}
	
	public static void printNode(Node n1) {
		Node curr=n1;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		if(curr==null) {
			System.out.print(" null");
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(3);
		n1.next.next = new Node(5);

		Node n2 = new Node(2);
		n2.next = new Node(4);
		n2.next.next = new Node(6);
		
		
		
	Node node=	mergeList(n1, n2);
	printNode(node);
	
	
	}

}
