package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int MAXNUM = 100;
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		sc.close();

		int res = sum - MAXNUM;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] + num[j] == res && num[i] != num[j]) {
					num1 = num[i];
					num2 = num[j];
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] != num1 && num[i] != num2) {
				System.out.println(num[i]);
			}
		}
	}
}
