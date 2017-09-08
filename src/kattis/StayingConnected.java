package kattis;

import java.util.Scanner;

public class StayingConnected {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int v = Integer.parseInt(scanner.nextLine());
			int e = Integer.parseInt(scanner.nextLine());
			int[][] g = new int[v][v];
			for(int i=0;i<e;i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				scanner.nextLine();
				
				g[x][y]=1;
				g[y][x]=1;
			}
			
			int[] vertices = new int[v];
			int cur = 0;
			for(int i=0;i<v;i++) {
				if(vertices[i]==0) {
					vertices[i]=++cur;
					dfs(i, cur, vertices, g);
				}								
			}
			
			int numberOfGraph = 0;
			for(int i:vertices) {
				numberOfGraph = Math.max(numberOfGraph, i);
			}
			
			System.out.println(numberOfGraph);
		}
		scanner.close();
	}
	
	private static void dfs(int i, int cur, int[] vertices, int[][] g) {
		for(int j=0;j<g.length;j++) {
			if(g[i][j]==1 && vertices[j]==0) {
				vertices[j]=cur;
				dfs(j,cur,vertices,g);
			}
		}
	}
}
