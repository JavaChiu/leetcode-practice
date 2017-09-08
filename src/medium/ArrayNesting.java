package medium;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayNesting {
//    public int arrayNesting(int[] nums) {
//        int[] book = new int[nums.length];
//        int maxLength=0;
//        for(int i=0;i<nums.length;i++) {
//        	if(book[i]==1) continue;
//        	int tempLength = dfs(i,nums,book,0);        	
//        	if(tempLength>maxLength) maxLength=tempLength;
//        }
//        return maxLength;
//    }
    
    public int arrayNesting(int[] nums) {
        int res = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] < 0) continue;
            int length = 1, val = nums[i];
            while (Math.abs(val) != i) {
                length++;
                val = nums[Math.abs(val)];
                nums[Math.abs(val)] *= -1;
            }
            res = Math.max(res, length);
        }
        return res;
    }    
    
    private int dfs(int curPosition,int[] inputArray, int[] book, int curLength) {
    	if(book[curPosition]==1) return curLength;
    	
    	book[curPosition]=1;
    	return dfs(inputArray[curPosition], inputArray,book, ++curLength);
    }
    
    public static void main(String[] args) {
		ArrayNesting arrayNesting = new ArrayNesting();
		System.out.println(arrayNesting.arrayNesting(new int[] {5,4,0,3,1,6,2}));
	}
}
