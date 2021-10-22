package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
			*	
		*	*	*	
	*	*	*	*	*	
		*	*	*	
			*	
*/

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int star = 1;
		int space = n/2;

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= space; col++) {
				System.out.print("\t");
			}
			
			for (int col = 1; col <= star; col++) {
				System.out.print("*\t");
			}

			if (row <= n / 2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			System.out.println();
		}
		sc.close();
	}
}
