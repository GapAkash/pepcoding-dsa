package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - 57,  2
	OUTPUT -  111001
	EXP - Divide decimal by base until it becomes 0 and print remainder backwards
*/

import java.util.Scanner;

public class B_DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getValueInBase(n, b);
		System.out.println(dn);
		scn.close();
	}

	public static int getValueInBase(int n, int b) {
		int ans = 0;
		int pow = 1; // 10^0

		while (n > 0) {
			int rem = n % b;
			n = n / b;

			ans = ans + rem * pow;
			pow *= 10;
		}
		return ans;
	}
}
