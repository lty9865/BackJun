package q2292;

import java.util.Scanner;

public class Main {

	public int roomCount(int num) {
		int count = 1;
		int range = 1;
		while (true) {
			if (num <= range) {
				return count;
			} else {
				range += (count * 6);
				count++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		int result = m.roomCount(num);
		System.out.println(result);
	}
}
