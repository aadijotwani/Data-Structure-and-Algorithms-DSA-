package Sheet2;

import java.util.Scanner;

public class ArithmeticOperations {

	public static boolean check(int r1, int r2, int c1, int c2) {
		if (r1 == r2 && c1 == c2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean mulCheck(int r2, int c1) {
		if (r2 == c1) {
			return true;
		}

		else {
			return false;
		}
	}

	public static void Operation(int[][] arr1, int[][] arr2, String s) {
		int[][] arr = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				arr[i][j] = s.equals("+") ? arr1[i][j] + arr2[i][j] : arr1[i][j] - arr2[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void Multiplication(int[][] arr1, int[][] arr2) {
		
		int[][] arr = new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				for(int k=0; k<arr2.length; k++) {
					arr[i][j] += arr1[i][k] * arr2[k][j]; 
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Rows 1: ");
		int r1 = sc.nextInt();
		System.out.print("Cols 1: ");
		int c1 = sc.nextInt();

		System.out.print("Rows 2: ");
		int r2 = sc.nextInt();
		System.out.print("Cols 2: ");
		int c2 = sc.nextInt();

		int[][] arr1 = new int[r1][c1];
		int[][] arr2 = new int[r2][c2];

		System.out.println("Please enter the elements of the array 1 :");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Please enter the elemens of the array 2 :");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		boolean check = check(r1, r2, c1, c2);
		boolean mulCheck = mulCheck(r2, c1);;
		if (check == true ) {
			System.out.println("Please + or -");
			String s = sc.next();
			if (s.equals("+") || s.equals("-")) {
				Operation(arr1, arr2, s);
			}
		}
		
		if(mulCheck == true) {
			Multiplication(arr1, arr2);
		}
		
		else {
			System.out.println("Condition do not meet :(, Sorry!");
		}
		
	}

}
