package medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddOneRowToTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode addOneRow(TreeNode root, int v, int d) {   
		return dfs(root, 1, v, d);
	}

	private TreeNode dfs(TreeNode root, int level, int v, int d) {
        if(d==1) {
			TreeNode newRoot = new TreeNode(v);
			newRoot.left=root;
			return newRoot;
		} else if (level == d - 1) {
			TreeNode temp = root.left;
			root.left = new TreeNode(v);
			root.left.left = temp;
			temp = root.right;
			root.right = new TreeNode(v);
			root.right.right = temp;
			return root;
        } else {
			if(root.left!=null) dfs(root.left, level+1, v, d);
            if(root.right!=null) dfs(root.right, level+1, v, d);
			return root;
		}
	}
}
