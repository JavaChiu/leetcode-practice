package medium;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int timeSum=0;
        int tempEnd=0;
    	for(int i:timeSeries) {
        	if(tempEnd>i) {
        		timeSum+=duration-(tempEnd-i);
        	}else {
        		timeSum+=duration;
        	}        		        		
        	tempEnd=i+duration;
        }
    	return timeSum;
    }
    
    public static void main(String[] args) {
    	TeemoAttacking teemoAttacking = new TeemoAttacking();
		System.out.println(teemoAttacking.findPoisonedDuration(new int[] {1,2,3},3));
	}
}
