package kattis;

import java.util.Scanner;

public class Aibohphobic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			if(palindrome(input)) {
				System.out.println("PALINDROME");
			}else {
				System.out.println("NOT PALINDROME");
			}
		}
		scanner.close();
	}
	
	private static boolean palindrome(String s) {
		int n = s.length();
		if(n==1) {
			return true;
		}else if(n==2) {
			if(s.endsWith(s.substring(0, 1))) {
				return true;
			}else {
				return false;
			}
		}else {
			if(s.endsWith(s.substring(0, 1))) {
				return palindrome(s.substring(1, n-1));
			}else {
				return false;
			}			
		}
	}
}
