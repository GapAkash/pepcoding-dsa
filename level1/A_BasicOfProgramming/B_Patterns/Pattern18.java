package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	*	*	*	*	*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*/

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int star = n;
		int space = 0;

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= space; col++) {
				System.out.print("\t");
			}

			for (int col = 1; col <= star; col++) {
				if (row >= 2 && row <= n / 2) {
					if (col == 1 || col == star) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else {
					System.out.print("*\t");
				}
			}

			if (row <= n / 2) {
				star -= 2;
				space++;
			} else {
				star += 2;
				space--;
			}
			System.out.println();
		}
		sc.close();
	}
}
