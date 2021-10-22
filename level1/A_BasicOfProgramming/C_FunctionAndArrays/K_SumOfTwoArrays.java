package level1.A_BasicOfProgramming.C_FunctionAndArrays;

/*
	INPUT - array size - 5, array contents - 3 1 0 7 5
	OUTPUT -  
	
				*		
				*		
				*	*	
				*	*	
	*			*	*	
	*			*	*	
	*	*		*	*	
	
	EXP - 
*/

import java.util.Scanner;

public class K_SumOfTwoArrays {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] one = new int[n1];

		for (int i = 0; i < one.length; i++) {
			one[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int[] two = new int[n2];

		for (int i = 0; i < two.length; i++) {
			two[i] = sc.nextInt();
		}

		int[] sum = new int[n1 > n2 ? n1 : n2];

		int i = one.length - 1;
		int j = two.length - 1;
		int k = sum.length - 1;

		int carry = 0;

		while (k >= 0) {
			int digit = carry;

			if (i >= 0) {
				digit += one[i];
			}

			if (j >= 0) {
				digit += two[j];
			}

			carry = digit / 10;
			digit = digit % 10;

			sum[k] = digit;

			i--;
			j--;
			k--;

		}
		if (carry > 0) {
			System.out.println(carry);
		}

		for (int l = 0; l < sum.length; l++) {
			System.out.println(sum[l]);
		}

		sc.close();
	}

}
