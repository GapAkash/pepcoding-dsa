package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class O_MaxMin2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max1 = 0;
		int max2 = 0;

		int min1 = 0;
		int min2 = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max1]) {
				max2 = max1;
				max1 = i;
			} else if (arr[i] > arr[max2]) {
				max2 = i;
			}

			if (arr[i] < arr[min1]) {
				min2 = min1;
				min1 = i;
			} else if (arr[i] < arr[min2]) {
				min2 = i;
			}
		}
		System.out.print(arr[max2] + " " + arr[min2]);

		sc.close();
	}
}
