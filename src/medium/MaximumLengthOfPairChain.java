package medium;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {
//	public int findLongestChain(int[][] pairs) {
//		Arrays.sort(pairs, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				return o1[0] - o2[0];
//			}
//		});
//		int tempEnd = pairs[0][1];
//		int chain = 0;
//		for (int i = 1; i < pairs.length; i++) {
//			if (pairs[i][1] > tempEnd) {
//				chain++;
//				tempEnd = pairs[i][1];
//			}
//		}
//		return chain;
//	}
	
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) return 0;
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]);
            }
        }
        return dp[pairs.length - 1];
    }	

	public static void main(String[] args) {
		MaximumLengthOfPairChain maximumLengthOfPairChain = new MaximumLengthOfPairChain();
		System.out.println(maximumLengthOfPairChain.findLongestChain(new int[][]{{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}}));		
	}
}
