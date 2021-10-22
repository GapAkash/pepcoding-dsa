package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class C_PrintAllPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();

		for (int i = low; i <= high; i++) {
			boolean isPrime = true;
			for (int div = 2; div * div <= high; div++) {
				if (i % div == 0) {
					isPrime=false;
					break;
				}
			} if(isPrime) {
				
				System.out.println(i);
			}
		}
		sc.close();
	}
}
