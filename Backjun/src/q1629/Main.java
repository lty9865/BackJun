package q1629;

import java.util.Scanner;

class Function {
    private int A, B, C;
    private double result;

    Function(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void multi() {
        for (int i = 0; i < getB(); i++) {
            if (result == 0) {
                result = A;
            } else {
                result *= A;
            }
        }
        result = result % C;
    }

    public double getResult() {
        return result;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }
}

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        Function f = new Function(A, B, C);
        f.multi();
        double res = f.getResult();
        System.out.println((int)res);
    }
}
