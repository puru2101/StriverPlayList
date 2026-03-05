package com.Tree.easy.diameter;

import com.Tree.easy.TreeNode;

public class DiameterOfTree {
	static int diameter = 0;

	public static int height(TreeNode treeNode) {

		if (treeNode == null) {
			return 0;
		}
		int leftMaxHeight = height(treeNode.left);
		int rightMaxHeight = height(treeNode.right);

		diameter = Math.max(diameter, leftMaxHeight + rightMaxHeight);
		return 1 + Math.max(leftMaxHeight, rightMaxHeight);

	}

	public static int diameter(TreeNode treeNode) {
		height(treeNode);
		return diameter;

	}

	
//	    1
//     / \
//    2   3
//   / \
//  4   5
	
	
	public static void main(String[] args) {
	     TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        System.out.println("Diameter: " + diameter(root));
	    }
	}


