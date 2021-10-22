package level1.A_BasicOfProgramming.C_FunctionAndArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_RotateAnArray {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	public static void reverse(int[] a, int left, int right) {

		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;

			left++;
			right--;
		}
	}

	public static void rotate(int[] a, int k) {
		k = k % a.length;
		if (k < 0) {
			k += a.length;
		}

		// part 1
		reverse(a, 0, a.length - k - 1);

		// part 2
		reverse(a, a.length - k, a.length - 1);

		// whole part
		reverse(a, 0, a.length - 1);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		rotate(a, k);
		display(a);
	}

}