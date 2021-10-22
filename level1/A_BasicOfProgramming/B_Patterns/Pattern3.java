package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
					*	
				*	*	
			*	*	*	
		*	*	*	*	
	*	*	*	*	*	

*/

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {
			
			for (int colSpace = 1; colSpace <= n-row; colSpace++) {
				System.out.print("\t");
			}
			
			for (int colStar = 1; colStar <= row; colStar++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
