package kattis;

import java.util.Scanner;

public class MelborpLasreverA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			System.out.println(reverse(scanner.nextLine()));
		}
		scanner.close();
	}
	
	private static String reverse(String s) {
		int n = s.length();
		if(n==0) {
			return s;
		}else {
			return reverse(s.substring(1, n))+s.substring(0,1);
		}
	}
}
