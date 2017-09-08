package kattis;

import java.util.Arrays;
import java.util.Scanner;

public class SnowedIn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int[] input = new int[scanner.nextInt()];
			scanner.nextLine();
			for(int i=0;i<input.length;i++) {
				input[i] = scanner.nextInt();
			}
			Arrays.sort(input);
			System.out.println(input[input.length-1]-input[0]);
		}
		scanner.close();		
	}
}
