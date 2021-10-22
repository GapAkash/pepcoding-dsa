package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

/*
 	INPUT - 2 4
 			11 12 13 14
 			21 22 23 24
 	
 	OUTPUT - 11 12 13 14
			 21 22 23 24
*/

public class H_TheStateOfWakanda2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int gap = 0; gap < arr[0].length; gap++) {
			for (int i = 0, j = gap; j < arr[0].length; i++, j++) {
				System.out.println(arr[i][j]);
			}

		}

		sc.close();
	}

}
