package q11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();
        sc.close();
        Long result = A + B + C;
        System.out.print(result);
    }
}
