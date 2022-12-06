package q15649;

import java.util.Scanner;

public class Main {
	private int num;
	private int arrNum;

	public int getNum() {
		return num;
	}

	public int getArrNum() {
		return arrNum;
	}

	public void setNum(int num, int arrNum) {
		if ((num >= 1 && num <= 8) && (arrNum >= 1 && arrNum <= 8)) {
			this.num = num;
			this.arrNum = arrNum;
		}
		return;
	}

	public void printNum() {
		for (int i = 1; i <= getNum(); i++) {
			if (getArrNum() > 1) {
				for (int j = 1; j <= getNum(); j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arrNum = sc.nextInt();
		sc.close();

		Main m = new Main();
		m.setNum(num, arrNum);
		m.printNum();
	}
}