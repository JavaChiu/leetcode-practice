package kattis;

import java.util.Scanner;

public class ColdputerScience {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			scanner.nextLine();
			int numOfNagatives=0;
			for(int i=0;i<n;i++) {
				if(scanner.nextInt()<0) {
					numOfNagatives++;
				}
			}
			System.out.println(numOfNagatives);
		}
		scanner.close();
	}
}
