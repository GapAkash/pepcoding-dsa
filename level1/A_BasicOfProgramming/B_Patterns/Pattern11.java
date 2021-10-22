package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	1	
	2	3	
	4	5	6	
	7	8	9	10	
	11	12	13	14	15							

*/

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int digit = 1;

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(digit + "\t");
				digit++;
			}
			System.out.println();
		}
		sc.close();
	}

}
