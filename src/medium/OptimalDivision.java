package medium;

public class OptimalDivision {
	public String optimalDivision(int[] nums) {
		if (nums.length == 1) {
			return String.valueOf(nums[0]);
		} else if (nums.length == 2) {
			return String.valueOf(nums[0])+"/"+String.valueOf(nums[1]);
		} else {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(String.valueOf(nums[0]));
			stringBuffer.append("/(");
			for (int i = 1; i < nums.length; i++)
				stringBuffer.append(String.valueOf(nums[i]) + "/");
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
			stringBuffer.append(")");
			return stringBuffer.toString();
		}
	}

	public static void main(String[] args) {
		OptimalDivision optimalDivision = new OptimalDivision();
		int[] testCase = new int[] { 1000, 100, 10, 2 };
		System.out.println(optimalDivision.optimalDivision(testCase));
	}
}
