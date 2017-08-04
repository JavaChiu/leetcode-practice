package medium;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.HashMap;

public class CountBattleships {
	// private class Point2D {
	// int x;
	// int y;
	//
	// Point2D(int x, int y) {
	// this.x = x;
	// this.y = y;
	// }
	// }

	public int countBattleships(char[][] board) {
		HashMap<Point, Integer> shipHashMap = new HashMap<Point, Integer>();

		int battleShips = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '.')
					continue;

				Point tempPoint = new Point(i, j);
				if (shipHashMap.containsKey(tempPoint)) {
					continue;
				} else {
					shipHashMap.put(tempPoint, ++battleShips);
					
					for(int k=i;k<board.length;k++) {
						if(board[i][j]=='.') continue;
						else shipHashMap.put(new Point(i,j), battleShips);
					}					
					
					for (j = j + 1; j < board[i].length; j++) {
						if(board[i][j]=='.') continue;
						else shipHashMap.put(new Point(i,j), battleShips);
					}
										

				}

			}
		}
		
		return battleShips;
	}
	
	public static void main(String[] args) {
		CountBattleships countBattleships = new CountBattleships();
		char[][] charArray = new char[][] {{'x','.','.','x'},{'.','.','.','x'},{'.','.','.','x'}};
		System.out.println(countBattleships.countBattleships(charArray));
	}
}
