package kattis;

import java.util.Scanner;

public class TheApaxiansStrikeBack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			int count = 1;
			char first = s.charAt(0);
			for(int i=1;i<s.length();i++) {
				if(s.charAt(i)==first) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
