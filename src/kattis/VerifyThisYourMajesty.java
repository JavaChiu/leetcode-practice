package kattis;

import java.util.Scanner;

public class VerifyThisYourMajesty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[][] input = new String[scanner.nextInt()][2];
			scanner.nextLine();
			for (int i = 0; i < input.length; i++) {
				input[i] = scanner.nextLine().split(" ");
			}

			boolean isCorrect = true;
			for (int i = 0; i < input.length; i++) {
				for (int j = i + 1; j < input.length; j++) {
//					if (input[i][0].equals(input[j][0]) || input[i][1].equals(input[j][1])
//							|| (Math.abs(Integer.parseInt(input[i][0])
//									- Integer.parseInt(input[i][1])) == Math.abs(Integer.parseInt(input[j][0])
//											- Integer.parseInt(input[j][1])))) {
//						isCorrect = false;
//					}
					if (input[i][0].equals(input[j][0])) {
						isCorrect = false;
						continue;
					}
					if(input[i][1].equals(input[j][1])){
						isCorrect = false;
						continue;
					}
					if (Math.abs(Integer.parseInt(input[j][1])
									- Integer.parseInt(input[i][1]))==Math.abs(Integer.parseInt(input[j][0])
											- Integer.parseInt(input[i][0]))) {
						isCorrect = false;
						continue;
					}
				}
			}
			
			if(isCorrect) {
				System.out.println("CORRECT");
			}else {
				System.out.println("INCORRECT");
			}
		}
		scanner.close();
	}
}
