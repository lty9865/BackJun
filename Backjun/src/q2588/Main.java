package q2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String n2 = sc.next();
        sc.close();

        int[] arr = new int[n2.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(n2.charAt(i));
        }

//        System.out.print(arr[0]);
        for (int i = arr.length - 1; i >= 0; i--) {
            int res = n1 * arr[i];
            System.out.println(res);
        }
        System.out.println(n1 * Integer.parseInt(n2));
    }
}
