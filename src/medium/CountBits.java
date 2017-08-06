package medium;

import java.util.ArrayList;

public class CountBits {
    public int[] countBits(int num) {
        int[] returnArray = new int[num+1];
        returnArray[0]=0;
        
        ArrayList<Integer> bitsList = new ArrayList<Integer>();
        bitsList.add(1);
        int j=0; //iteration of bitsList
        
        for(int i=1;i<num+1;i++) {
    		returnArray[i]=bitsList.get(j);
    		if(j==bitsList.size()-1) {
    			int currentLength = bitsList.size();
    			for(int k=0;k<currentLength;k++) bitsList.add(bitsList.get(k)+1);
    			j=0;
    			continue;
    		}
    		j++;
    	}
        
        return returnArray;
    }
    
    /*
     * online approach with bit manipulation 
     * An easy recurrence for this problem is f[i] = f[i / 2] + i % 2.
     */
//    public int[] countBits(int num) {
//        int[] f = new int[num + 1];
//        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
//        return f;
//    }
    
    public static void main(String[] args) {
		CountBits countBits = new CountBits();
		int[] testArray = countBits.countBits(8);
		for(int i: testArray) System.out.println(i);
	}
}
