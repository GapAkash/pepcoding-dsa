package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

public class I_SaddlePrice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int min = arr[i][0];
			int saddleColumn = 0;
			
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][j]<min) {
					min = arr[i][j];
					saddleColumn = j;
				}
			}
			
			boolean isSaddle = true;
			for (int row = 0; row < arr.length; row++) {
				if (arr[row][saddleColumn] > min) {
					isSaddle = false;
					break;
				}
			}
			
			if (isSaddle) {
				System.out.println(min);
				sc.close();
				return;
			}
			
		}
		System.out.println("Invalid input");
		sc.close();
	}

}
