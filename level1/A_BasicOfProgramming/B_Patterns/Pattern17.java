package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
			*	
			*	*	
	*	*	*	*	*	
			*	*	
			*		
*/

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int star = 1;
		int space = n / 2;

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= space; col++) {
				if (row == n / 2 + 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}

			for (int col = 1; col <= star; col++) {
				System.out.print("*\t");
			}

			if (row <= n / 2) {
				star++;
			} else {
				star--;
			}
			System.out.println();
		}
		sc.close();
	}
}
