package kattis;

import java.util.Scanner;

public class AWinningStrategy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int m = scanner.nextInt();
			scanner.nextLine();
			int b = scanner.nextInt();
			scanner.nextLine();
			int n = scanner.nextInt();
			scanner.nextLine();
			String[] plays = scanner.nextLine().split(" ");
			
			int curBet = b;
			for(int i=0;i<n&&m>0;i++) {
				if(plays[i].equals("1")) {
					m+=curBet;
					curBet = Math.min(b, m);
				}else if(plays[i].equals("0")) {
					m-=curBet;
					curBet = Math.min(2*curBet, m);
				}
			}
			
			if(m>0) {
				System.out.println(m);
			}else {
				System.out.println("BROKE");
			}
		}
		scanner.close();
	}
}
