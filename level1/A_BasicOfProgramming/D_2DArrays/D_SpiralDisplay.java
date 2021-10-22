package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

public class D_SpiralDisplay {

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

		int minR = 0;
		int minC = 0;

		int maxR = arr.length - 1;
		int maxC = arr[0].length - 1;

		int count = 1;
		int total = a * b;

		while (count <= total) {
			// left wall, downwards [what is constant and what varies]
			for (int i = minR; i <= maxR; i++) {
				System.out.println(arr[i][minC]);
				count++;
			}
			minC++;

			// bottom wall, rightwards
			for (int j = minC; j <= maxC; j++) {
				System.out.println(arr[maxR][j]);
				count++;
			}
			maxR--;

			// right wall, upwards
			for (int i = maxR; i >= minR; i--) {
				System.out.println(arr[i][maxC]);
				count++;
			}
			maxC--;

			// top wall, leftwards
			for (int j = maxC; j >= minC; j--) {
				System.out.println(arr[minR][j]);
				count++;
			}
			minR++;
		}
		sc.close();
	}

}
