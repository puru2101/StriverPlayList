package com.Tree.easy.printleafs;

import java.util.LinkedList;
import java.util.Queue;

public class printLeavesWithZeroNodes {

	public static void printLeavesWithZeroNode(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			TreeNode curr = q.poll();
			if (curr.left == null && curr.right == null) {
				System.out.print(curr.data+",");
			}
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}

}
