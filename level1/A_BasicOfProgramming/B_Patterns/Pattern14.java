package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT (Fibonacci Series )
	5 * 1 = 5
	5 * 2 = 10
	5 * 3 = 15
	.
	.
	5 * 10 = 50
*/

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int mult = 1; mult <= 10; mult++) {
			System.out.println(n + " * " + mult + " = " + n * mult);
		}
		sc.close();
	}

}
