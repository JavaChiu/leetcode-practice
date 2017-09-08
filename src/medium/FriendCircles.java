package medium;

public class FriendCircles {
	public int findCircleNum(int[][] M) {
		int[] unionFindArray = new int[M.length];
		for (int i = 0; i < unionFindArray.length; i++) {
			unionFindArray[i] = i;
		}
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				if (i == j)
					continue;
				if(M[i][j]==1)
					unionFindArray[i]=findRoot(unionFindArray, j);
			}
		}
		int count=0;
		for(int k=0;k<unionFindArray.length;k++) {
			if(k==unionFindArray[k]) count++;
		}
		return count;
	}

	private int findRoot(int[] unionFindArray, int curPosition) {
		if (unionFindArray[curPosition] == curPosition) {
			return curPosition;
		} else {
			return findRoot(unionFindArray, unionFindArray[curPosition]);
		}
	}

	// public int findCircleNum(int[][] M) {
	// int count = 0;
	// int[] book = new int[M.length];
	// for (int i = 0; i < M.length; i++) {
	// if (book[i] == 0) {
	// count++;
	// dfs(M, book, i);
	// }
	//
	// }
	// return count;
	// }
	//
	// private void dfs(int[][] input, int[] book, int curRow) {
	// if (book[curRow] == 1)
	// return;
	// book[curRow] = 1;
	// for (int i = 0; i < input[curRow].length; i++) {
	// if (input[curRow][i] == 1)
	// dfs(input, book, i);
	// }
	// }

	public static void main(String[] args) {
		FriendCircles friendCircles = new FriendCircles();
		System.out.println(friendCircles.findCircleNum(new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } }));
	}
}
