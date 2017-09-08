package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
    	int[] res = new int[nums.length];
    	
    	Stack<Integer> stack = new Stack<>();
    	for(int i=nums.length-1;i>=0;i--) {
    		stack.push(i);
    	}
    	
    	for(int i=nums.length-1;i>=0;i--) {
    		res[i]=-1;
    		
    		while(!stack.isEmpty() && nums[i]>=nums[stack.peek()] ) {
    			stack.pop();
    		}
    		
    		if(!stack.isEmpty()) {
    			res[i] = nums[stack.peek()];
    		}
    		
    		stack.push(i);
    	}
    	
    	return res;
    }
	
	public static void main(String[] args) {
		NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();
		for(int num:nextGreaterElementII.nextGreaterElements(new int[] {5,4,3,2,1})) {
			System.out.println(num);
		}
	}
}
