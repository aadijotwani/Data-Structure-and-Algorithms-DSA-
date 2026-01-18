package Sheet1;

import java.util.Scanner;

public class Traversal {

	public static void diagnol(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i%2 == 0) {
					if(j == 0 || j == arr[0].length-1) {
						System.out.print(arr[i][j]+" ");
					}
				}
				else {
					if(j == (arr[0].length-1)/2) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter no. of rows: ");
		int r = sc.nextInt();
		System.out.print("Please enter no. of columns: ");
		int c = sc.nextInt();

		System.out.println("Please enter matrix: ");
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int ele = sc.nextInt();
				arr[i][j] = ele;
				System.out.print(ele + " ");
			}
			System.out.println();
		}

		System.out.println("_________________________________\n");
		diagnol(arr);
	}
}