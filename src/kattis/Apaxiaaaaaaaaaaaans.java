package kattis;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String inputString = scanner.nextLine();
			StringBuffer res = new StringBuffer();
			res.append(inputString.charAt(0));
			for(int i=1;i<inputString.length();i++) {
				if(inputString.charAt(i)!=inputString.charAt(i-1)) {
					res.append(inputString.charAt(i));
				}
			}
			System.out.println(res.toString());
		}
		scanner.close();
	}		
}
