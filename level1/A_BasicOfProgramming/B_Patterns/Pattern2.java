package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	*	*	*	*	*	
	*	*	*	*	
	*	*	*	
	*	*	
	*
*/

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int row = 0; row < n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
