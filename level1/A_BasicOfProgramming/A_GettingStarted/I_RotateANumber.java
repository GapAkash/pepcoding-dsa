package level1.A_BasicOfProgramming.A_GettingStarted;

import java.util.Scanner;

public class I_RotateANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int temp=n;
		int nod = 0;	//Number Of Digits
		while(temp>0) {
			temp = temp/10;
			nod++;
		}
		
		k = k % nod;	//Special case 1 - suppose if nod is 5 but k is 12 basically that means rotate it by 2 (2+5*2)
		while(k<0) {	//Special case 2 - If k is negative then add nod, i.e. if k is -3 then add 5 so it will be 2 which is equivalent 
			k = k + nod;
		}

		int div = (int) Math.pow(10, k);
		int mult = (int) Math.pow(10, nod-k);
		
		int rem = n % div;
		
		int sum = (n / div) + (rem * mult);	
		
		System.out.println(sum);
		
		sc.close();
	}
}
