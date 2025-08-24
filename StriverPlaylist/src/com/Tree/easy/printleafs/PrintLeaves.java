package com.Tree.easy.printleafs;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeaves {

	public static void printNodeWithoutZeroLeaves(TreeNode node) {
		if (node == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty()) {
			TreeNode curr = q.poll();
			
			 if (curr.left != null && curr.right != null) {
			        System.out.print(curr.data + ",");
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
