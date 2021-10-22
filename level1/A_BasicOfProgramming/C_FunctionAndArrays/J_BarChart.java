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

public class J_BarChart {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[max]) {
				max = i;
			}
		}

		for (int hight = arr[max]; hight >=1; hight--) {
			for (int i = 0; i < arr.length; i++) {
	            if(arr[i]>= hight){
	                System.out.print("*\t");
	            } else {
	                System.out.print("\t");
	            }
	        }
			System.out.println();
		}

		sc.close();
	}

}
