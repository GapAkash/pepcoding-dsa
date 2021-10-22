package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	*	*	*		*	*	*	
	*	*				*	*	
	*						*	
	*	*				*	*	
	*	*	*		*	*	*
*/

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int star = n / 2 + 1;
		int space = 1;

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= star; col++) {
				System.out.print("*\t");
			}

			for (int col = 1; col <= space; col++) {
				System.out.print("\t");
			}

			for (int col = 1; col <= star; col++) {
				System.out.print("*\t");
			}

			if (row <= n / 2) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			System.out.println();
		}
		sc.close();
	}
}
