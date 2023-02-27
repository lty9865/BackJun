package q2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int resA = A;
        int resB = B + C;
        int count = 0;
        while (resB >= 60) {
            resB -= 60;
            count++;
        }
        resA += count;
        if (resA >= 24) {
            resA = Math.abs(resA - 24);
        }
        System.out.println(resA + " " + resB);
    }
}
