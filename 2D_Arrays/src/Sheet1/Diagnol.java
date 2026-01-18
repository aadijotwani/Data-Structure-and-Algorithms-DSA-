package Sheet1;

import java.util.Scanner;

public class Diagnol {

	public static void Below_Diag(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j < i)
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Above_diag(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j > i)
					System.out.print(arr[i][j] + " ");
				else if(j<i)
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Rows: ");
		int r = sc.nextInt();
		System.out.print("No. of Columns: ");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];
		System.out.println("Please enter the elements of the array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		Below_Diag(arr);
		System.out.println();
		Above_diag(arr);
		
	}

}
