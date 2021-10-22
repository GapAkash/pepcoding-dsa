package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - 111001,  2
	OUTPUT -  57
	EXP - Divide number by 10 until it becomes 0 and print remainder backwards
*/

import java.util.Scanner;

public class C_AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
		scn.close();
	}

	public static int getValueIndecimal(int n, int b) {
		int ans = 0;
		int pow = 0;
		// int pow = 1;

		while (n > 0) {
			int rem = n % 10;
			n = n / 10;

			ans = ans + rem * (int) Math.pow(b, pow);
			// ans = ans + rem * pow;
			pow++;
			// pow = pow * b;
		}
		return ans;
	}
}
