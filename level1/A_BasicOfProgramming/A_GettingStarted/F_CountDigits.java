package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class F_CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n > 0) {
			int rem = n % 10;
			System.out.println(rem);
			n = n / 10;
		}
		sc.close();
	}
}
