package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class G_DigitsOfANumber {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;
		int div = 1;
		while (temp >= 10) {
			temp = temp / 10;
			div = div * 10;
		}

		temp=n;
		while (div >= 1) {
			System.out.println(temp / div);
			temp = temp % div;
			div = div / 10;
		}
		sc.close();

	}
}
