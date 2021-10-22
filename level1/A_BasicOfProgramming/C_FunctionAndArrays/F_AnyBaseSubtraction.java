package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - base - 8, n1 - 777, n2 - 1
	OUTPUT -  1000
	EXP - 
*/

import java.util.Scanner;

public class F_AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getDifference(b, n1, n2);
		System.out.println(d);
		scn.close();
	}

	public static int getDifference(int b, int n1, int n2) {
		int ans = 0;
		int carry = 0;
		int pow = 1;

		while (n2 > 0) {
			int rem1 = n1 % 10;
			int rem2 = n2 % 10;

			n1 = n1 / 10;
			n2 = n2 / 10;

			int rem = (rem2 + carry - rem1);

			if (rem < 0) {
				rem = rem + b;
				carry = -1;
			} else {
				carry = 0;
			}

			ans = ans + rem * pow;
			pow *= 10;
		}
		return ans;
	}

}
