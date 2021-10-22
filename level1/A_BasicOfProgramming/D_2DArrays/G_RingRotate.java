package level1.A_BasicOfProgramming.D_2DArrays;

import java.util.Scanner;

/*
 	INPUT - 2 4
 			11 12 13 14
 			21 22 23 24
 	
 	OUTPUT - 11 12 13 14
			 21 22 23 24
*/

public class G_RingRotate {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] twoDArr = new int[n][m];

		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr[0].length; j++) {
				twoDArr[i][j] = sc.nextInt();
			}
		}

		int shellNum = sc.nextInt();
		int rotate = sc.nextInt();

		int[] oneDArr = getOneDFromShell(twoDArr, shellNum);
		rotate(oneDArr, rotate);
		fillTwoDShellFromOne(oneDArr, twoDArr, shellNum);
		display(twoDArr);

		sc.close();
	}

	public static int[] getOneDFromShell(int[][] twoDArr, int shell) {
		int rows = twoDArr.length;
		int cols = twoDArr[0].length;

		int minR = shell - 1;
		int minC = shell - 1;
		int maxR = rows - shell;
		int maxC = cols - shell;

		int vwcount = maxR - minR + 1;
		int hwcount = maxC - minC + 1;
		int sz = 2 * vwcount + 2 * hwcount - 4;

		int[] oned = new int[sz];
		int idx = 0;

		// left wall | row increases from mir to mar, col stays at mic
		for (int i = minR, j = minC; i <= maxR; i++) {
			oned[idx] = twoDArr[i][j];
			idx++;
		}
		minC++;

		// bottom wall | row stays at mar, col increases from mic to mac
		for (int i = maxR, j = minC; j <= maxC; j++) {
			oned[idx] = twoDArr[i][j];
			idx++;
		}
		maxR--;

		// right wall | row decreases from mar to mir, col stays at mac;
		for (int i = maxR, j = maxC; i >= minR; i--) {
			oned[idx] = twoDArr[i][j];
			idx++;
		}
		maxC--;

		// top wall | row stays at mir, col decreases from mac to mic
		for (int i = minR, j = maxC; j >= minC; j--) {
			oned[idx] = twoDArr[i][j];
			idx++;
		}
		minR++;

		return oned;
	}

	public static void fillTwoDShellFromOne(int[] oned, int[][] twod, int s) {
		int rows = twod.length;
		int cols = twod[0].length;

		int mir = s - 1;
		int mic = s - 1;
		int mar = rows - s;
		int mac = cols - s;

		int idx = 0;

		// left wall | row increases from mir to mar, col stays at mic
		for (int i = mir, j = mic; i <= mar; i++) {
			twod[i][j] = oned[idx];
			idx++;
		}
		mic++;

		// bottom wall | row stays at mar, col increases from mic to mac
		for (int i = mar, j = mic; j <= mac; j++) {
			twod[i][j] = oned[idx];
			idx++;
		}
		mar--;

		// right wall | row decreases from mar to mir, col stays at mac;
		for (int i = mar, j = mac; i >= mir; i--) {
			twod[i][j] = oned[idx];
			idx++;
		}
		mac--;

		// top wall | row stays at mir, col decreases from mac to mic
		for (int i = mir, j = mac; j >= mic; j--) {
			twod[i][j] = oned[idx];
			idx++;
		}
		mir++;
	}

	public static void rotate(int[] oned, int r) {
		r = r % oned.length;
		if (r < 0) {
			r += oned.length;
		}

		reverse(oned, 0, oned.length - r - 1);
		reverse(oned, oned.length - r, oned.length - 1); // second half
		reverse(oned, 0, oned.length - 1); // full
	}

	public static void reverse(int[] oned, int left, int right) {
		while (left < right) {
			int temp = oned[left];
			oned[left] = oned[right];
			oned[right] = temp;

			left++;
			right--;
		}
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
