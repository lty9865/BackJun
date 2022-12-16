package q10828;

import java.util.Scanner;

class Operation {
	int result;

	public Operation() {

	}

	public Operation(String op, int num) {

		switch (op) {
		case "push":
			break;
		case "pop":
			break;
		case "size":
			break;
		case "empty":
			break;
		case "top":
			break;
		}
	}

	public int getResult() {
		return result;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] mStack = new int[length];

		for (int i = 0; i < mStack.length; i++) {
			String str = sc.nextLine();
			if (str.isBlank()) {
				str.split(str);
			}

		}
	}
}
