package kattis;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThatSinkingFeeling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int s = scanner.nextInt();
			int r = scanner.nextInt();
			scanner.nextLine();

			Set<Ship> ships = new HashSet<Ship>();
			for (int i = 0; i < s; i++) {
				String[] temp = scanner.nextLine().split(" ");
				ships.add(new Ship(temp[0],temp[1]));
			}

			int score = 0;
			for (int i = 0; i < r; i++) {
				String[] hitArray = scanner.nextLine().split(" ");
				Ship curHit = new Ship(hitArray[0],hitArray[1]);
				if (ships.contains(curHit)) {
					score += 1000;
					ships.remove(curHit);
				} else { // find smallest manhattan dist
					int minManhattan = Integer.MAX_VALUE;
					for (Ship ship : ships) {
						Math.min(minManhattan, Math.abs(Integer.parseInt(ship.x) - Integer.parseInt(curHit.x))
								+ Math.abs(Integer.parseInt(ship.y) - Integer.parseInt(curHit.y)));
					}
					score += (1000 - minManhattan * 100);
				}
			}
			int hit = s-ships.size();
			System.out.println(hit+"/"+s+" ships sunk. Score: "+score+" points");
		}
		scanner.close();
	}
	
	public static class Ship{
		String x;
		String y;
		
		public Ship(String x, String y) {
			this.x = x;
			this.y = y;
		}		
		
	}
}
