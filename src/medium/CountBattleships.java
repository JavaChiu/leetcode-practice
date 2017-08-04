package medium;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CountBattleships {
    public int countBattleships(char[][] board) {
        HashSet<Point> shipList = new HashSet<Point>();

        int battleShips = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.')
                    continue;

                Point tempPoint = new Point(i, j);
                if (shipList.contains(tempPoint)) {
                    continue;
                } else {
                    battleShips++;
                    shipList.add(tempPoint);

                    for (int k = i+1; k < board.length; k++) {
                        if (board[k][j] == '.')
                            continue;
                        else
                            shipList.add(new Point(k, j));
                    }

                    for (j = j + 1; j < board[i].length; j++) {
                        if (board[i][j] == '.')
                            continue;
                        else
                            shipList.add(new Point(i, j));
                    }

                }

            }
        }

        return battleShips;
    }

    /*
     * online sample, only count if the X is the first one.
     */
//    public int countBattleships(char[][] board) {
//        int numberOfShips = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == '.') 
//                    continue;
//                if (i > 0 && board[i - 1][j] == 'X')
//                    continue;
//                if (j > 0 && board[i][j - 1] == 'X')
//                    continue;
//                numberOfShips++;
//            }
//        }
//        return numberOfShips;
//    }

    public static void main(String[] args) {
        CountBattleships countBattleships = new CountBattleships();
        char[][] charArray = new char[][] { { 'X', '.', '.', 'X' }, { '.', '.', '.', 'X' }, { '.', '.', '.', 'X' } };
        System.out.println(countBattleships.countBattleships(charArray));
    }
}
