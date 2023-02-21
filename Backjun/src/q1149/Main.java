package q1149;

import java.util.Scanner;

public class Main {
    private int N;
    private int[][] arr;
    private int sum;

    Main(int N, int[][] arr) {
        this.N = N;
        this.arr = arr;
    }

    public int paint(int num, int color) {
        if (num == N) {
            return sum;
        }
        if (num == 0) {
            int min = 1001;
            for (int i = 0; i < arr[0].length; i++) {
                if (min > arr[num][i]) {
                    min = arr[num][i];
                }
            }
            for (int j = 0; j < arr[0].length; j++) {
                if (min == arr[num][j]) {
                    sum += min;
                    paint(num + 1, j);
                }
            }
        } else {
            arr[num][color] = 1002;
            int min = 1001;
            for (int i = 0; i < arr[0].length; i++) {
                if (min > arr[num][i]) {
                    min = arr[num][i];
                }
            }
            for (int j = 0; j < arr[0].length; j++) {
                if (min == arr[num][j]) {
                    sum += min;
                    paint(num + 1, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        Main m = new Main(N, arr);
        int result = m.paint(0, 0);
        System.out.println(result);
    }
}
