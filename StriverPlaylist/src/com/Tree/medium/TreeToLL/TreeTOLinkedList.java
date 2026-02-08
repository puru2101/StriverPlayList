package com.Tree.medium.TreeToLL;

import java.util.LinkedList;

public class TreeTOLinkedList {

	public static TreeNode TreeToLL(TreeNode root) {
		if (root == null) {
			return null;
		}
		LinkedList<TreeNode> ll = new LinkedList<>();
		ll.add(root);
		TreeNode head = null;
		TreeNode prev = null;
		while (!ll.isEmpty()) {
			TreeNode curr = ll.poll();

			if (head == null) {
				head = curr;
			} else {
				prev.right = curr;
			}
			
			
			if (curr.left != null)
				ll.add(curr.left);

			if (curr.right != null)
				ll.add(curr.right);
			prev = curr;
			curr.left = null;


		}
		return root;
	}
    public static void printLL(TreeNode head) {
        TreeNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.right;
        }
        System.out.println("null");
    }

}
