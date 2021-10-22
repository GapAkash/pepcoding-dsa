package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
			*	
		*		*	
	*				*	s
		*		*	
			*	
*/

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int nos = n / 2;
		int nis = -1;

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= nos; col++) {
				System.out.print("\t");
			}
			
			System.out.print("*\t");

			for (int col = 1; col <= nis; col++) {
				System.out.print("\t");
			}

			if(row>1 && row <n) {
				System.out.print("*\t");
			}

			if (row <= n / 2) {
				nis += 2;
				nos--;
			} else {
				nis -= 2;
				nos++;
			}
			System.out.println();
		}
		sc.close();
	}
}
