package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class L_PrimeFactorisationOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int div = 2; div*div <= n; div++) {
			while(n%div==0) {
				n = n / div;
				System.out.print(div+" ");
			}
		}
		
		if (n > 0) {
			System.out.print(n);
		}
		
		
		sc.close();
	}
}
