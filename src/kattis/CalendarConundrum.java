package kattis;

import java.util.Scanner;

public class CalendarConundrum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if(a>31) {
				System.out.println("Format #3");
			}else if(a>12 && a<=31) {
				if(c>31) {
					System.out.println("Format #2");
				}else {
					System.out.println("Ambiguous");
				}
			}else if(a<=12) {
				if(b>12) {
					System.out.println("Format #1");
				}else {
					System.out.println("Ambiguous");
				}
			}
		}
		scanner.close();
	}
}
