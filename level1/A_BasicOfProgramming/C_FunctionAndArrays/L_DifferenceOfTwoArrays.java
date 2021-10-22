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

public class L_DifferenceOfTwoArrays {

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

		int[] diff = new int[n2];

		int i = one.length - 1;
		int j = two.length - 1;
		int k = diff.length - 1;

		int carry = 0;

		while (k >= 0) {
			int digit = two[j] + carry;

			if (i >= 0) {
				digit -= one[i];
			}

			if (digit < 0) {
				digit += 10;
				carry = -1;
			} 

			diff[k] = digit;

			i--;
			j--;
			k--;

		}

		int index = 0;
		while (diff[index] == 0) {
			index++;
		}

		for (int l = index; l < diff.length; l++) {
			System.out.println(diff[l]);
		}

		sc.close();
	}

}
