package com.Tree.easy.identicalTrees;

import com.Tree.easy.identicalTrees.*;

public class IdenticalTrees {

	public static boolean identicalTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		return (root1.data == root2.data) &&
				identicalTrees(root1.left, root2.left)
				&& identicalTrees(root1.right, root2.right);
	}
}
