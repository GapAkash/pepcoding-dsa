package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class D_PrintAllPrimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();

		for (int num = low; num <= high; num++) {
			for (int div = 2; div * div <= num; div++) {
				if (num % div != 0) {
					System.out.println(num);
					break;
				}
			}
		}
		scn.close();
	}
}
