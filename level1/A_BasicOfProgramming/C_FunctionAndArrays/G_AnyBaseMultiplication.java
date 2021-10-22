package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - base - 8, n1 - 777, n2 - 1
	OUTPUT -  1000
	EXP - 
*/

import java.util.Scanner;

public class G_AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);
		scn.close();
	}

	private static int getProduct(int b, int n1, int n2) {

		int ans = 0;
		int pow = 1;

		while (n2 > 0) {
			int d2 = n2 % 10;
			n2 = n2 / 10;

			int singleProduct = getProductWithSingleDigit(b, n1, d2);
			ans = getSum(b, ans, singleProduct * pow);

			pow *= 10;

		}

		return ans;
	}

	private static int getProductWithSingleDigit(int b, int n1, int d2) {

		int ans = 0;
		int carry = 0;
		int pow = 1;

		while (n1 > 0 || carry > 0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;

			int rem = d1 * d2 + carry;

			carry = rem / b;
			rem = rem % b;

			ans = ans + rem * pow;
			pow *= 10;
		}

		return ans;
	}

	public static int getSum(int b, int n1, int n2) {
		int ans = 0;
		int carry = 0;
		int pow = 1;

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
