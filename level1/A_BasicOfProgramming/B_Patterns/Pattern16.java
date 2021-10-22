package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	1								1	
	1	2						2	1	
	1	2	3				3	2	1	
	1	2	3	4		4	3	2	1	
	1	2	3	4	5	4	3	2	1
*/

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int noStar = 1;
		int noSpace = 2 * n - 3;

		int num = 1;

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= noStar; col++) {
				System.out.print(num + "\t");
				num++;
			}
			for (int col = 1; col <= noSpace; col++) {
				System.out.print("\t");
			}

			if (row == n) {
				noStar--;
				num--;
			}
			for (int col = 1; col <= noStar; col++) {
				num--;
				System.out.print(num + "\t");
			}

			noStar++;
			noSpace -= 2;

			System.out.println();
		}
		sc.close();
	}
}
