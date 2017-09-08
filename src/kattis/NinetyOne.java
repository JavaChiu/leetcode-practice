package kattis;

import java.util.Scanner;

public class NinetyOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			System.out.println(m(scanner.nextInt()));
		}
		scanner.close();
	}
	
	private static int m(int n) {
		if(n>100) {
			return n-10;
		}else {
			return m(m(n+11));
		}
	}
}
