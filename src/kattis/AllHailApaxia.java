package kattis;

import java.util.Scanner;

public class AllHailApaxia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String s = scanner.nextLine();
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 1; i < s.length(); i += 2) {
				stringBuffer.append(s.charAt(i));
				stringBuffer.append(s.charAt(i - 1));
			}
			if (s.length() % 2 == 1) {
				stringBuffer.append(s.charAt(s.length() - 1));
			}
			System.out.println(stringBuffer.toString());
		}
		scanner.close();
	}
}
