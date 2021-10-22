package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class K_GcdAndLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int temp1 = a, temp2 = b;

		while (temp1 % temp2 != 0) {
			int rem = temp1 % temp2;
			temp1 = temp2;
			temp2 = rem;
		}
		int gcd = temp2;
		int lcm = (a * b) / gcd;	//formula to calculate LCM
		System.out.println(gcd + "\n" + lcm);
		
		sc.close();
	}
}
