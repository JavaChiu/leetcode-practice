package kattis;

import java.util.Scanner;

public class AGreedyHike {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			scanner.nextLine();
			int xs = scanner.nextInt();
			int ys = scanner.nextInt();
			scanner.nextLine();
			int[][] mountain = new int[x][y];
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					mountain[i][j]=scanner.nextInt();
				}
				scanner.nextLine();
			}
			
			int sum=0;
			while(ys<y-1) {
				int x_1 = Integer.MAX_VALUE;
				if(xs-1>=0) {
					x_1 = Math.abs(mountain[xs][ys]-mountain[xs-1][ys+1]);
				}
				
				int x_0 = Math.abs(mountain[xs][ys]-mountain[xs][ys+1]);
				
				int x1 = Integer.MAX_VALUE;
				if(xs+1<x) {
					x1 = Math.abs(mountain[xs][ys]-mountain[xs+1][ys+1]);
				}
				
				int curStep = Math.min(x_1, x_0);
				curStep = Math.min(curStep, x1);
						
				ys++;
				sum+=curStep;
				if(curStep==x_0) {
					
				}else if(curStep==x1) {
					xs++;
				}else if(curStep==x_1) {
					xs--;
				}
			}
			
			System.out.println(xs+" "+ys+" "+sum);
		}
		scanner.close();
	}
}
