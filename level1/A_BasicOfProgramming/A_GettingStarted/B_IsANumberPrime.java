package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class B_IsANumberPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		for (int i = 1; i <= t; i++) {
			int n = scn.nextInt();
			boolean isPrime = true;
			for (int div = 2; div * div <= n; div++) {
				if (n % div == 0) {
					isPrime = false;
					System.out.println("not prime");

					break;
				}
			} if(isPrime) {				
				System.out.println("prime");
			}
		}
		scn.close();
	}
}
