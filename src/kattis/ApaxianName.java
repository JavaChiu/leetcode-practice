package kattis;

import java.util.Scanner;

public class ApaxianName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String comunityName = scanner.nextLine();
			int n = Integer.parseInt(scanner.nextLine());
			
			int princess=0;
			int baron=0;
			int priest=0;
			int commoner=0;
			
			for(int i=0;i<n;i++) {
				String curName = scanner.nextLine();
				if(curName.startsWith(comunityName)) {
					princess++;
				}else if(curName.endsWith(comunityName)){
					baron++;
				}else if(curName.contains(comunityName)) {
					priest++;
				}else {
					commoner++;
				}
			}
			
			System.out.println(princess+ " PRINCESS");
			System.out.println(baron+ " BARON");
			System.out.println(priest+" PRIEST");
			System.out.println(commoner+" COMMONER");
		}
		scanner.close();
	}
}
