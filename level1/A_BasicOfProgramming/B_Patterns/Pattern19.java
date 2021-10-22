package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	*	*	*		*	
			*		*	
	*	*	*	*	*	
	*		*			
	*		*	*	*
*/

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1) {
					if (col <= n / 2 + 1 || col == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (row < n / 2 + 1) {
					if (col == n / 2 + 1 || col == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (row == n / 2 + 1) {
					System.out.print("*\t");

				} else if (row < n) {
					if (col == n / 2 + 1 || col == 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (row == n) {
					if (col >= n / 2 + 1 || col == 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
