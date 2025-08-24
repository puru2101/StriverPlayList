package com.Tree.easy.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {

//    5
//   /\
//  4  6
// /\  /\ 
//1 12 8 3
	public static void levelOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty()) {
			TreeNode curr = q.poll();
			System.out.print(curr.data + ",");
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}

	}

}
