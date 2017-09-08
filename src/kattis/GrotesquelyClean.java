package kattis;

import java.util.Scanner;

public class GrotesquelyClean {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNext()) {
		String[] input = scanner.nextLine().split(" ");
		boolean needClean = false;
		int sum = 0;
		for(String s:input) {
			int temp = Integer.parseInt(s);
			if(temp>=6) {
				needClean=true;
				break;
			}else {
				sum+=temp;
			}			
		}
		if(!needClean && sum>=30) {
			needClean=true;
		}
		
		if(needClean) {
			System.out.println("CLEAN");
		}else {
			System.out.println("DO NOT CLEAN");
		}
	}
	scanner.close();
}
}
