package kattis;

import java.util.Scanner;

public class ReverseMinesweeper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			scanner.nextLine();
			String[][] inputArray = new String[x][];
			for (int i = 0; i < x; i++) {
				inputArray[i] = scanner.nextLine().split(" ");
			}
			String[][] res = new String[x][y];

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (inputArray[i][j].equals("1")) {
						res[i][j] = "X";
						continue;
					}

					int count = 0;
					if (i - 1 >= 0 && j - 1 >= 0) {
						if (inputArray[i - 1][j - 1].equals("1")) {
							count++;
						}
					}

					if (i - 1 >= 0) {
						if (inputArray[i - 1][j].equals("1")) {
							count++;
						}
					}

					if (i - 1 >= 0 && j + 1 < y) {
						if (inputArray[i - 1][j + 1].equals("1")) {
							count++;
						}
					}

					if (j + 1 < y) {
						if (inputArray[i][j + 1].equals("1")) {
							count++;
						}
					}

					if (i + 1 < x && j + 1 < y) {
						if (inputArray[i + 1][j + 1].equals("1")) {
							count++;
						}
					}

					if (i + 1 < x) {
						if (inputArray[i + 1][j].equals("1")) {
							count++;
						}
					}

					if (i + 1 < x && j - 1 >= 0) {
						if (inputArray[i + 1][j - 1].equals("1")) {
							count++;
						}
					}

					if (j - 1 >= 0) {
						if (inputArray[i][j - 1].equals("1")) {
							count++;
						}
					}

					if (count == 0) {
						res[i][j] = "-";
					} else {
						res[i][j] = String.valueOf(count);
					}
				}
			}
			
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					System.out.print(res[i][j]);
				}
				System.out.println();
			}
		}
	}
}
