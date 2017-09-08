package kattis;

import java.util.Scanner;

public class RaindropsKeepFallingOnOurSensors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int times = scanner.nextInt();
			scanner.nextLine();
			String[] input = scanner.nextLine().split(" ");
			int sum = 0;
			for (String s : input) {
				if (Integer.valueOf(s) >= 0) {
					sum+=Integer.valueOf(s);
				}else {
					times--;
				}
			}
			
			if(times>0) {
				System.out.println((int)sum/times);
			}else {
				System.out.println("INSUFFICIENT DATA");
			}
		}
		scanner.close();
	}
}
