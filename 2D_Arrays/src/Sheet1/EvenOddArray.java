package Sheet1;

import java.util.Scanner;

public class EvenOddArray {

	public static void Even(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]%2==0)
					System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public static void Odd(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]%2!=0)
					System.out.print(arr[i][j]+" ");
			}
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
		
		System.out.print("Even Elements are: ");
		Even(arr);
		System.out.println();
		System.out.print("Odd Elements are: ");
		Odd(arr);
	}
}
