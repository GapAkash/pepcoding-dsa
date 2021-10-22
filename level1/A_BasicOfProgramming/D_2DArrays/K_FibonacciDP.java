package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

public class K_FibonacciDP {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = fibDP(n, new int[n+1]);
		System.out.println(ans);
		
		sc.close();
	}

	private static int fibDP(int n, int[] fibArr) {
		
		if (n == 0 || n ==1) {
			return n;
		}
		
		if(fibArr[n] != 0) {
			return fibArr[n];
		}
		
		System.out.println(n);
		int fibNm1 = fibDP(n-1, fibArr);
		int fibNm2 = fibDP(n-2, fibArr);
		int fibN = fibNm1 + fibNm2;
		
		fibArr[n] = fibN;
		return fibN;
	}

}
