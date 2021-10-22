package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - array size - 6, array contents - 15 30 40 4 11 9 
	OUTPUT -  36
	EXP - Difference between maximum element and minimum element of the array i.e. 40-4=36
*/

import java.util.Scanner;

public class H_SpanOfArray {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;
		int min = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}

			if (arr[i] < arr[min]) {
				min = i;
			}
		}

		System.out.println(arr[max] - arr[min]);

		sc.close();
	}

}
