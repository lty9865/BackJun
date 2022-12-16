package q18108;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unYear = sc.nextInt();
		sc.close();

		int yearDiff = (unYear - 1) - 2562;
		int result = 2022 - Math.abs(yearDiff - 1);

		System.out.println(result - 1);
	}
}
