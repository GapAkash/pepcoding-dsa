package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class E_PrintFibonacciNumbersTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0, b = 1, c;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}
}
