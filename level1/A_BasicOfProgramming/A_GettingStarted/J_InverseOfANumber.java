package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class J_InverseOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit = 1;
		
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			
			sum = sum + (digit * (int)Math.pow(10, rem-1));
			digit++;
		}
		System.out.println(sum);

		
		sc.close();
	}


}
