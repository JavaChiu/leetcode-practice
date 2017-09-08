package kattis;

import java.util.Scanner;
import java.util.Stack;

public class OdwrotnaNotacjaPolska {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			Stack<Object> stack = new Stack<>();
			boolean isEnd = false;
			for (String s : input) {
				if (s.equals("+") || s.equals("*") || s.equals("==") || s.equals("and") || s.equals("or")) {
					Object a = null;
					Object b = null;
					if (stack.isEmpty()) {
						System.out.println("SYNTAX ERROR");
						isEnd=true;
						break;
					} else {
						a = stack.pop();
					}
					if (stack.isEmpty()) {
						System.out.println("SYNTAX ERROR");
						isEnd=true;
						break;
					} else {
						b = stack.pop();
					}
					
					if(s.equals("+") || s.equals("*")|| s.equals("==")) {
						if(a.equals("true")||a.equals("false")||b.equals("true")||b.equals("false")) {
							System.out.println("TYPE ERROR");
							isEnd=true;
							break;
						}else {
							if(s.equals("+")) {
								stack.push(Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b)));
							}else if(s.equals("*")) {
								stack.push(Integer.parseInt(String.valueOf(a))*Integer.parseInt(String.valueOf(b)));
							}else if(s.equals("==")) {
								if(Integer.parseInt(String.valueOf(a))==Integer.parseInt(String.valueOf(b))) {
									stack.push("true");
								}else {
									stack.push("false");
								}
							}
						}
					}else if(s.equals("and")||s.equals("or")) {
						if((a.equals("true")||a.equals("false"))&&(b.equals("true")||b.equals("false"))) {
							if(s.equals("and")) {
								if(String.valueOf(a).equals("true")&&String.valueOf(b).equals("true")) {
									stack.push("true");
								}else {
									stack.push("false");
								}
							}else if(s.equals("or")){
								if(String.valueOf(a).equals("true")||String.valueOf(b).equals("true")) {
									stack.push("true");
								}else {
									stack.push("false");
								}								
							}
						}else {
							System.out.println("TYPE ERROR");
							isEnd=true;
							break;							
						}
					}
				} else {
					stack.push(s);
				}
			}

			if (!isEnd) {
				if (stack.size() > 1) {
					System.out.println("SYNTAX ERROR");
				} else {
					System.out.println(stack.pop());
				}
			}
		}
		scanner.close();
	}
}
