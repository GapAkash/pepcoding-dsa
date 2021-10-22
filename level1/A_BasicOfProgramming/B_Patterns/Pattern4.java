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

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int row = 0; row < n; row++) {
			
			for (int colSpace = 1; colSpace <= row; colSpace++) {
				System.out.print("\t");
			}
			
			for (int colStar = 1; colStar <= n-row; colStar++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
