package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	*				*	
		*		*		
			*			
		*		*		
	*				*							

*/

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == col || row + col == n + 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
