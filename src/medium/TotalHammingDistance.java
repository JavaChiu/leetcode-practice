package medium;

import java.util.LinkedList;

public class TotalHammingDistance {
	public int totalHammingDistance(int[] nums) {
		LinkedList<Integer> exclusiveList = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			for(int j=i+1;j<nums.length;j++) {
				exclusiveList.add(nums[i] ^ nums[j]);
			}
		}

		int count = 0;
		for (int i : exclusiveList) {
			double temp = i;
			while (true) {
				count += temp % 2;
				temp = temp / 2;
				if(temp<1) {
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		TotalHammingDistance totalHammingDistance = new TotalHammingDistance();
		System.out.println(totalHammingDistance.totalHammingDistance(new int[] { 4, 14, 2 }));
	}
}
