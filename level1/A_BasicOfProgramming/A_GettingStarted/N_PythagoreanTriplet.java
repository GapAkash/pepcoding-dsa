package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class N_PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		if (max == a) {
			if (a * a == (b * b) + (c * c)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else if (max == b) {
			if (b * b == (a * a) + (c * c)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			if (c * c == (a * a) + (b * b)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

		sc.close();
	}
}
