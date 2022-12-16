package q10926;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String newId = sc.next();
		String old = newId;
		sc.close();

		if (old.equals(newId)) {
			System.out.println(newId + "??!");
		}
	}
}
