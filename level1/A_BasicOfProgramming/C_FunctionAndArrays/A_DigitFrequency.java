package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - 994543234, 4
	OUTPUT -  3
	EXP - 4 is occurred 3 times in given digit
*/

import java.util.Scanner;

public class A_DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int f = getDigitFrequency(n, d);
		System.out.println(f);
		scn.close();
	}

	public static int getDigitFrequency(int n, int d) {
		int digit = 0;

		while (n > 0) {
			if (n % 10 == d) {
				digit++;
			}
			n = n / 10;
		}

		return digit;
	}
}
