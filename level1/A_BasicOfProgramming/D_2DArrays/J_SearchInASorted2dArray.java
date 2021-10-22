package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

public class J_SearchInASorted2dArray {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int num = sc.nextInt();

		int i = 0;
		int j = arr[0].length - 1;

		while (i < arr.length && j >= 0) {
			if (num > arr[i][j]) {
				i++;
			} else if (num < arr[i][j]) {
				j--;
			} else {
				System.out.println(i + "\n" + j);
				sc.close();
				return;
			}
		}
		System.out.println("Not Found");
		sc.close();

	}

}
