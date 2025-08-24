package com.Tree.easy.minMax;

import com.Tree.easy.minMax.*;

public class MinMaxNode {

	public static int minNode(TreeNode root) {

		if (root == null)
			return Integer.MAX_VALUE;

		int min = Math.min(minNode(root.left),minNode(root.right));
		return Math.min(root.data, min);
	}
	
	public static int maxNode(TreeNode root) {

		if (root == null)
			return Integer.MIN_VALUE;

		int min = Math.max(maxNode(root.left),maxNode(root.right));
		return Math.max(root.data, min);
	}

}
