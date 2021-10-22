package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

/*
 	INPUT - 2 4
 			11 12 13 14
 			21 22 23 24
 	
 	OUTPUT - 11 12 13 14
			 21 22 23 24
*/

public class E_ExitPointOfAMatrix {

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

		int i = 0;
		int j = 0;
		int dir = 0; // 0 = east, 1 = south, 2 = west, 3 = north
		while (true) {
			dir = (dir + arr[i][j]) % 4;

			if (dir == 0) {
				j++;
				if (j == arr[0].length) {
					j--;
					break;
				}
			} else if (dir == 1) {
				i++;
				if (i == arr.length) {
					i--;
					break;
				}
			} else if (dir == 2) {
				j--;
				if (j == -1) {
					j++;
					break;
				}
			} else {
				i--;
				if (i == -1) {
					i++;
					break;
				}
			}

		}
		System.out.println(i+"\n"+j);

		sc.close();
	}

}
