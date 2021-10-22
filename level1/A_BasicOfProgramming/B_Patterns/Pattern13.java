package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
	1	
	1	1	
	1	2	1	
	1	3	3	1	
	1	4	6	4	1
	
	EXP - 1st column is always 1 && iCj+1 = iCj * (i-j) / (j + 1);
	i.e. if 5C0 = 1 then 5C1 = 5C0 * (5-0)/(0+1) i.e. 1 * (5/1) = 5
	&					 5C2 = 5C1 * (5-1)/(1+1) i.e. 5 * (4/2) = 10 etc...
*/

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + "\t");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
		sc.close();
	}

}
