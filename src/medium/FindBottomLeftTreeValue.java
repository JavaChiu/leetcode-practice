package medium;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindBottomLeftTreeValue {
	/**
	 * Definition for a binary tree node.
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int findBottomLeftValue(TreeNode root) {		
		LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			root = nodeQueue.poll();
			if (root.right != null)
				nodeQueue.add(root.right);
			if (root.left != null)
				nodeQueue.add(root.left);
		}
		return root.val;
	}
}
