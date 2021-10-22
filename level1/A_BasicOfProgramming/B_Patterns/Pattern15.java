package level1.A_BasicOfProgramming.B_Patterns;

/*
	INPUT - 5
	
	OUTPUT
			1	
		2	3	2	
	3	4	5	4	3	
		2	3	2	
			1	
*/

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int star = 1;
		int space = n / 2;

		int num = 1;
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= space; col++) {
				System.out.print("\t");
			}

			int temp = num;
			for (int col = 1; col <= star; col++) {
				System.out.print(temp + "\t");

				if (col <= star / 2) {
					temp++;
				} else {
					temp--;
				}

			}

			if (row <= n / 2) {
				star += 2;
				space--;
				num++;
			} else {
				star -= 2;
				space++;
				num--;
			}
			System.out.println();
		}
		sc.close();
	}
}
