package com.Tree.easy;

public class TreeNode {

	 int data;
	 TreeNode left;
	 TreeNode right;

	public TreeNode(int data) {
		super();
		this.data = data;
	}

	public static void main(String[] args) {
		TreeNode head = new TreeNode(5);
		head.left = new TreeNode(4);
		head.right = new TreeNode(6);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(12);
		head.right.left = new TreeNode(8);
		head.right.right = new TreeNode(3);
		
//	       5
//	      /\
//	     4  6
//	    /\  /\ 
//	   1 12 8 3

		System.out.print("Inorder: ");
		TreeTraversal.inOrder(head);

		System.out.print("    preOrder: ");
		TreeTraversal.preOrder(head);

		System.out.print("    postOrder: ");
		TreeTraversal.postOrder(head);
	}

}
