package medium;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int allProduct = 1;
		int numberOfZero = 0;
		for (int num : nums) {
			if (num != 0) {
				allProduct *= num;
			} else {
				numberOfZero++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (numberOfZero > 1) {
				nums[i] = 0;
			} else if (numberOfZero == 1) {
				if (nums[i] == 0) {
					nums[i] = allProduct;
				} else {
					nums[i] = 0;
				}
			} else {
				nums[i] = allProduct / nums[i];
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
		int[] testArray = productOfArrayExceptSelf.productExceptSelf(new int[] { 1, 0 });
		for (int i : testArray)
			System.out.println(i);		
	}
}
