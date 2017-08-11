package medium;

public class PalindromicSubstrings {	
	/*
	 * online solution
	 */
	public int countSubstrings(String s) {
		int numberOfPalindrome = 0;
		for(int i=0;i<s.length();i++) {
			numberOfPalindrome+=checkPalindrome(s, i, i);
			numberOfPalindrome+=checkPalindrome(s, i, i+1);
		}
		
		return numberOfPalindrome;
	}

	private int checkPalindrome(String s, int left, int right) {
		int count=0;
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
			count++;
		}
		return count;
	}

	/*
	 * My solution uses too much time to determine the same thing
	 */
	// public int countSubstrings(String s) {
	// int numberOfPalindrome = 0;
	// for (int i = 1; i <= s.length(); i++) {
	// for (int j = 0; j + i <= s.length(); j++) {
	// if (determinePalindrome(s.substring(j, j + i)) == true)
	// numberOfPalindrome++;
	// }
	// }
	// return numberOfPalindrome;
	// }
	//
	// private boolean determinePalindrome(String s) {
	// if (s.length() == 1)
	// return true;
	// if (s.endsWith(s.substring(0, 1))) {
	// if (s.length() == 2) {
	// return true;
	// } else {
	// return determinePalindrome(s.substring(1, s.length() - 1));
	// }
	// } else {
	// return false;
	// }
	// }

	public static void main(String[] args) {
		PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
		System.out.println(palindromicSubstrings.countSubstrings("aaa"));
	}
}
