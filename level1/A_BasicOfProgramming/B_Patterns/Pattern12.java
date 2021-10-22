package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT (Fibonacci Series )
	0	
	1	1	
	2	3	5	
	8	13	21	34	
	55	89	144	233	377							

*/

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		int temp;

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(a + "\t");
				temp = a + b;
				a = b;
				b = temp;
			}
			System.out.println();
		}
		sc.close();
	}

}
