package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - array size - 5, array contents - 15 30 40 4 11 9 
	OUTPUT -  9 11 4 40 30 15
	EXP - 
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M_ReverseAnArray {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	public static void reverse(int[] a) {
		int leftIndex = 0;
		int rightIndex = a.length-1;
		
		while(leftIndex < rightIndex) {
			int temp = a[leftIndex];
			a[leftIndex] = a[rightIndex];
			a[rightIndex] = temp;
			
			leftIndex++;
			rightIndex--;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		reverse(a);
		display(a);
	}

}
