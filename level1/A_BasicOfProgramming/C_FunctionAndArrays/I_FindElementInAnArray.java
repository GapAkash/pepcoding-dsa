package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - array size - 6, array contents - 15 30 40 4 11 9 
	OUTPUT -  36
	EXP - Difference between maximum element and minimum element of the array i.e. 40-4=36
*/

import java.util.Scanner;

public class I_FindElementInAnArray {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int element = sc.nextInt();
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				index = i;
				break;
			}
		}

		System.out.println(index);

		sc.close();
	}

}
