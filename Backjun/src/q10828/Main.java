package q10828;

import java.util.Scanner;
import java.util.Stack;

class Operation {
	int count;
	int result;
	Stack<Integer> numO = new Stack<Integer>();

	public Operation(int count) {
		this.count = count;
	}

	public Operation(String op, int num) {
		switch (op) {
		case "push":
			numO.push(num);
			break;
		case "pop":
			if (numO.empty()) {
				System.out.println("-1");
			} else {
				result = numO.pop();
				System.out.println(getResult());
			}
			break;
		case "size":
			System.out.println(numO.size());
			break;
		case "empty":
			if (numO.empty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			break;
		case "top":
			if (numO.empty()) {
				System.out.println("-1");
			} else {
				System.out.println(numO.peek());
			}
			break;
		}
	}

	public int getCount() {
		return count;
	}

	public int getResult() {
		return result;
	}

}

public class Main {
	public static void main(String[] args) {
		Stack<Integer> num = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			String str = sc.nextLine();
			if(str.isBlank()) {
				str.split(str);
			}

		}
	}
}
