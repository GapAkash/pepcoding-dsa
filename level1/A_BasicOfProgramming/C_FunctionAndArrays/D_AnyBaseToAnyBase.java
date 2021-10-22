package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - 111001, 2, 3
	OUTPUT -  2010
	EXP - convert given input to decimal from source base and then decimal base to destination base
*/

import java.util.Scanner;

public class D_AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();
		int num = sourceBaseToDecimal(n, sourceBase);
		int ans = decimalToDestinationBase(num, destBase);
		System.out.println(ans);
		scn.close();
	}

	public static int sourceBaseToDecimal(int n, int sourceBase) {

		int ans = 0;
		int pow = 1;

		while (n > 0) {
			int rem = n % 10;
			n = n / 10;

			ans = ans + rem * pow;
			pow = pow * sourceBase;
		}
		return ans;
	}

	public static int decimalToDestinationBase(int num, int destBase) {

		int ans = 0;
		int pow = 1;

		while (num > 0) {
			int rem = num % destBase;
			num = num / destBase;

			ans = ans + rem * pow;
			pow = pow * 10;
		}

		return ans;

	}

}
