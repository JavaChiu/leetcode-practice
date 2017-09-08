package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * You need to find the largest value in each row of a binary tree.
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 */

public class FindLargestValueInEachTreeRow {
	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
    public List<Integer> largestValues(TreeNode root) {
    	List<Integer> returnList = new LinkedList<Integer>();
    	Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();    	
    	
    	if(root!=null) nodeQueue.add(root);
    	
    	while(!nodeQueue.isEmpty()) {  
    		Integer maxValue = null;  //int largestElement = Integer.MIN_VALUE;
    		LinkedList<TreeNode> tempList = new LinkedList<TreeNode>();
        	while(!nodeQueue.isEmpty()) {  // use int size instead of isEmpty to improve memory usage
        		TreeNode tempNode = nodeQueue.poll();
                if(maxValue==null) maxValue=tempNode.val;
        		if(tempNode.val>maxValue) maxValue=tempNode.val;
        		if(tempNode.val>maxValue) maxValue=tempNode.val;
        		if(tempNode.left!=null) tempList.add(tempNode.left);
        		if(tempNode.right!=null) tempList.add(tempNode.right);
        	}    		
        	returnList.add(maxValue);
        	nodeQueue = new LinkedList<>();
        	for(TreeNode n:tempList) nodeQueue.add(n);
    	}
    	return returnList;    	
    }
    
    public static void main(String[] args) {
    	FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();
		TreeNode testNode = new TreeNode(1);
		testNode.left = new TreeNode(3);
		testNode.right = new TreeNode(2);
		testNode.left.left = new TreeNode(5);
		testNode.left.right = new TreeNode(3);
		testNode.right.right = new TreeNode(9);
		
		List<Integer> testList = findLargestValueInEachTreeRow.largestValues(testNode);
		for(Integer i:testList)
			System.out.println(i);
	}
    
    /*
     *  Online DFS
     * 
     *  public List<Integer> largestValues(TreeNode root) {
        	List<Integer> res = new ArrayList<Integer>();
        	helper(root, res, 0);
        	return res;
    	}
    	private void helper(TreeNode root, List<Integer> res, int d){
        	if(root == null){
            	return;
        	}
       	//expand list size
        if(d == res.size()){
            res.add(root.val);
        }
        else{
        //or set value
            res.set(d, Math.max(res.get(d), root.val));
        }
        helper(root.left, res, d+1);
        helper(root.right, res, d+1);
    }
     */
}
