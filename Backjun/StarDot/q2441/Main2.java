package q2441;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for(int i=0; i<num; i++) {
			for(int j=0; j < i; j++) {
				System.out.print(' ');
			}
			for(int j=0; j < num-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

