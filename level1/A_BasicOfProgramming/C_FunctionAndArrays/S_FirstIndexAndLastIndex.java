package level1.A_BasicOfProgramming.C_FunctionAndArrays;

import java.util.Scanner;

public class S_FirstIndexAndLastIndex {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int data = sc.nextInt();

		int fi = 0;
		int li = arr.length - 1;

		int first = -1;

		while (fi <= li) {
			int mid = (fi + li) / 2;

			if (data < arr[mid]) {
				li = mid - 1;
			} else if (data > arr[mid]) {
				fi = mid + 1;
			} else {
				first = mid;
				li = mid - 1;
			}
		}

		fi = 0;
		li = arr.length - 1;

		int last = -1;

		while (fi <= li) {
			int mid = (fi + li) / 2;

			if (data < arr[mid]) {
				li = mid - 1;
			} else if (data > arr[mid]) {
				fi = mid + 1;
			} else {
				last = mid;
				fi = mid + 1;
			}
		}
		System.out.println(first + "\n" + last);

		sc.close();
	}

}
