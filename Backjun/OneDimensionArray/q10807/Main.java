package q10807;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count  = sc.nextInt();

		int[] num = new int[count];

		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(num));
		int countNum = sc.nextInt();
		sc.close();
		
		int count1 = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i] == countNum) {
				count1++;
			}
		}
		System.out.print(count1);
	}

}
