package com.Tree.easy.height;

import com.Tree.easy.height.*;

public class HeightOfTree {

	public static int heightOfTree(TreeNode node) {
		if (node == null) {
			return -1;
		}
		int leftMax = heightOfTree(node.left);
		int rightMax = heightOfTree(node.right);

		return 1 + Math.max(leftMax, rightMax);

	}

}
