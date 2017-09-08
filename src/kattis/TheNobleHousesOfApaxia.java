package kattis;

import java.util.Scanner;

public class TheNobleHousesOfApaxia {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNext()) {
		String[] input = scanner.nextLine().split(" ");
		int n = input[1].length();
		StringBuffer stringBuffer = new StringBuffer();
		if(n==5) {
			for(int i=0;i<4;i++) {
				stringBuffer.append(input[1]);
			}
		}else {
			for(int i=0;i<n;i++) {
				stringBuffer.append(input[1]);
			}
		}
		
		System.out.println(input[0]+" "+stringBuffer.toString());
	}
	scanner.close();
}
}
