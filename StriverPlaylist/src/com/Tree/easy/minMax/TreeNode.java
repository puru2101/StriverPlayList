package com.Tree.easy.minMax;

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
		head.right.right.left = new TreeNode(12);

//	       5
//	      /\
//	     4  6
//	    /\  /\ 
//	   1 12 8 3

		TreeNode head1 = new TreeNode(5);
		head1.left = new TreeNode(4);
		head1.right = new TreeNode(6);
		head1.left.left = new TreeNode(1);
		head1.left.right = new TreeNode(12);
		head1.right.left = new TreeNode(8);
		head1.right.right = new TreeNode(3);
		head1.right.right.right = new TreeNode(12);
		System.out.println("Minimum Value Node : "+MinMaxNode.minNode(head1));	
		System.out.println("Maximum Value Node : "+MinMaxNode.maxNode(head1));	
	}

}
