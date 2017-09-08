package kattis;

import java.util.HashMap;
import java.util.Scanner;

public class ATrickyProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int rounds = scanner.nextInt();
			scanner.nextLine();
			String[] p1 = scanner.nextLine().split(" ");
			String[] p2 = scanner.nextLine().split(" ");

			HashMap<String, Integer> cards = new HashMap<String,Integer>();
			cards.put("1", 1);
			cards.put("2", 2);
			cards.put("3", 3);
			cards.put("4", 4);
			cards.put("5", 5);
			cards.put("6", 6);
			cards.put("7", 7);
			cards.put("8", 8);
			cards.put("9", 9);
			cards.put("J", 11);
			cards.put("Q", 12);
			cards.put("K", 13);
			cards.put("A", 14);
			
			int score=0;
			for (int i = 0; i < rounds; i++) {
				int temp = cards.get(p1[i])-cards.get(p2[i]);
				if(temp>0) {
					score++;
				}else if(temp<0){
					score--;
				}
			}

			if (score > 0) {
				System.out.println("PLAYER 1 WINS");
			} else if (score < 0) {
				System.out.println("PLAYER 2 WINS");
			} else {
				System.out.println("TIE");
			}

		}
		scanner.close();
	}
}
