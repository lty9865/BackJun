package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testNum = sc.nextInt();
		//		System.out.println(testNum);

		for(int i=0; i<testNum; i++) {
			String score = sc.next();
			for(int j=0; j<score.length(); j++) {
				int sum = 0;
				int cur = 0;
				if(score.charAt(j) == 'O') {
					cur = ++sum;
				}
			}
		}
	}
}
