package medium;

/*
 * The function should return the number of arithmetic slices in the array A.
 */

public class ArithmeticSlices {
	/*
	 * online solution
	 */
	public int numberOfArithmeticSlices(int[] A) {
		int curr = 0;
		int sum = 0;
		for (int i = 2; i < A.length; i++) {
			if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
				sum += ++curr; //every previous will count, and plus the current one with length 3
			} else {
				curr = 0; //otherwise the sequence discontinued
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArithmeticSlices arithmeticSlices = new ArithmeticSlices();
		System.out.println(arithmeticSlices.numberOfArithmeticSlices(new int[] {1,2,3,4,5}));
	}
}
