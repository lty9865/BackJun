package q10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();

        int result1, result2, result3, result4;
        result1 = (A + B) % C;
        result2 = ((A % C) + (B % C)) % C;
        result3 = (A * B) % C;
        result4 = ((A % C) * (B % C)) % C;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
