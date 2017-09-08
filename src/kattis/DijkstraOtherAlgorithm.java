package kattis;

import java.util.Scanner;

public class DijkstraOtherAlgorithm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			System.out.println(gcd(x,y));
		}
		scanner.close();
	}
	
	private static int gcd(int x, int y) {
		if(x==y) return x;
		if(x>y) {
			return gcd(x-y,y);
		}else {
			return gcd(x,y-x);
		}
	}
}
