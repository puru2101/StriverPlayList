package com.Tree.easy.printleafs;

import com.Tree.easy.bfs.LevelTraversal;

public class TreeNode {

	public int data;
	public TreeNode left;
	public TreeNode right;

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
		head.right.right.left = new TreeNode(2);
//	       5
//	      /\
//	     4  6
//	    /\  /\ 
//	   1 12 8 3
		System.out.println("Node with non zero child :");
		PrintLeaves.printNodeWithoutZeroLeaves(head);
		System.out.println();
		System.out.println("Node with  zero child :");

		printLeavesWithZeroNodes.printLeavesWithZeroNode(head);
	}

}
