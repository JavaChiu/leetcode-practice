package kattis;

import java.util.Scanner;

public class DontBeSuchASquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			System.out.println(exp(scanner.nextInt(),scanner.nextInt()));
		}
		scanner.close();
	}
	
	private static int exp(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return x;
		}
		if(n%2==0) {
			return exp(x*x,n/2);
		}else {
			return exp(x*x,(n-1)/2)*x;
		}
	}
}
