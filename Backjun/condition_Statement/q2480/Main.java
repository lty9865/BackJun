package q2480;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[6];
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            dice[num[i] - 1] += 1;
        }
        sc.close();

        int max = Arrays.stream(dice).max().getAsInt();
        int result = 0;
        switch (max) {
            case 3:
                result = 10000 + num[0] * 1000;
                break;
            case 2:
                for (int i = 0; i < dice.length; i++) {
                    if (dice[i] == max) {
                        result = 1000 + (i + 1) * 100;
                        break;
                    }
                }
                break;
            default:
                result = Arrays.stream(num).max().getAsInt() * 100;
                break;
        }
        System.out.println(result);
    }
}
