package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

/*
 	INPUT - 2 4
 			11 12 13 14
 			21 22 23 24
 	
 	OUTPUT - 11 12 13 14
			 21 22 23 24
*/

public class C_TheStateOfWakanda {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] arr = new int[a][b];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int j = 0; j < arr[0].length; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i][j] + " ");
				}
			} else {
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.println(arr[i][j] + " ");
				}
			}
		}

		sc.close();
	}

}
