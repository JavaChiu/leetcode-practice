package medium;

public class BeautifulArrangement {
	private int count;
	private int range;

	public int countArrangement(int N) {
		this.range = N;
		recursion(1, new int[N + 1]);
		return count;
	}

	private void recursion(int currentPosition, int[] usedNumber) {
		if (currentPosition > range) {
			count++;
			//for(int i:usedNumber) System.out.println(i);
		} else {
			for (int i = 1; i <= range; i++) {
				if (usedNumber[i] == 0 && (i % currentPosition == 0 || currentPosition % i == 0)) {
					usedNumber[i] = 1;
					recursion(currentPosition+1, usedNumber);  //first time I tried currentPosition++, which is wrong
					usedNumber[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BeautifulArrangement beautifulArrangement = new BeautifulArrangement();
		System.out.println(beautifulArrangement.countArrangement(2));
	}
}

/*
 * 1 [1] 
 * 2 [1,2] [2,1] 
 * 3 [1,2,3] [2,1,3] [3,2,1] 
 * 4 [1,2,3,4] [1,4,3,2] [2,1,3,4]
 * [2,4,3,1] [3,2,1,4] [3,4,1,2] [4,1,3,2] [4,2,3,1] 5 [1,2,3,4,5]
 */
