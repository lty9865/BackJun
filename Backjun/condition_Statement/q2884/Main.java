package q2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        M -= 45;
        if (M < 0) {
            H -= 1;
            M = 60 - Math.abs(M);
            if (H < 0)
                H = 23;
        }
        System.out.printf("%d %d", H, M);
    }
}
