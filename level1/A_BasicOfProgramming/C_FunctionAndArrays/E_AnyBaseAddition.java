package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - base - 8, n1 - 777, n2 - 1
	OUTPUT -  1000
	EXP - 
*/

import java.util.Scanner;

public class E_AnyBaseAddition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getSum(b, n1, n2);
		System.out.println(d);
		scn.close();
	}

	public static int getSum(int b, int n1, int n2) {
		int ans = 0;
		int pow = 1;
		int carry = 0;

		while (n1 > 0 || n2 > 0 || carry > 0) {
			int rem1 = n1 % 10;
			int rem2 = n2 % 10;

			n1 = n1 / 10;
			n2 = n2 / 10;

			int rem = (rem1 + rem2 + carry) % b;
			carry = (rem1 + rem2 + carry) / b;

			ans = ans + rem * pow;
			pow *= 10;
		}
		return ans;
	}
}
