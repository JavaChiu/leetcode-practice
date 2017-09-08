package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintBinaryTree {
	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

    public List<List<String>> printTree(TreeNode root) {
    	List<List<String>> returnList = new LinkedList<>();
    	int row = root==null?0:getHeight(root);
    	int column = (int)Math.pow(2, row)-1;
    	List<String> rowList = new ArrayList<>();
    	for(int i=0;i<column;i++) rowList.add("");
    	for(int i=0;i<row;i++) returnList.add(new ArrayList<>(rowList));
    	setReturnList(root, returnList, 0, row, 0, column);
    	return returnList;
    }
    
    private void setReturnList(TreeNode root, List<List<String>> returnList,int curRow, int totalRows, int min, int max) {
    	if(curRow>totalRows || root==null) return;
    	returnList.get(curRow).set((min+max)/2, String.valueOf(root.val));
    	setReturnList(root.left, returnList, curRow+1, totalRows, min, (min+max)/2);
    	setReturnList(root.right, returnList, curRow+1, totalRows, (min+max)/2, max);
    }
    
    private int getHeight(TreeNode root) {
    	if(root==null) return 0;
    	return 1+Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    public static void main(String[] args) {
		PrintBinaryTree printBinaryTree = new PrintBinaryTree();
		TreeNode testNode = new TreeNode(1);
		testNode.left = new TreeNode(2);
		List<List<String>> testList = printBinaryTree.printTree(testNode);
		for(List<String> l:testList) {
			for(String s:l) {
				System.out.println(s);
			}
		}
	}
}
