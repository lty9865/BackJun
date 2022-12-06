package q10871;

import java.util.Scanner;

public class Main {
	private int range, x;
	private int[] arrA;

	public int getRange() {
		return range;
	}

	public int getX() {
		return x;
	}

	public int[] getArr() {
		return arrA;
	}

	public void print() {
		for (int i = 0; i < getRange(); i++) {
			if (getArr()[i] < getX()) {
				System.out.print(getArr()[i] + " ");
			}
		}
	}

// --------------------------입력 메서드 부분 --------------------------------
	Scanner sc = new Scanner(System.in);

	public void input() {
		this.range = sc.nextInt(); // 수열 A의 배열 크기
		this.x = sc.nextInt();     // 기준
	}

	public void setArr() {
		arrA = new int[getRange()];
		for (int i = 0; i < getRange(); i++) {
			this.arrA[i] = sc.nextInt();
		}
		sc.close();
	}
// -----------------------------------------------------------------------

	public static void main(String[] args) {
		Main m = new Main();
		m.input(); // 사용자 값 입력
		m.setArr(); // 사용자 값 기반으로 수열 입력
		m.print(); // 조건에 맞는 값 출력
	}
}
