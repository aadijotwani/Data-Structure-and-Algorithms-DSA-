package Sheet2;

public class Pattern {

	public static void ZigZag(int[][] arr) {
		int i = 0, j = 0;

		while (j < arr[0].length) {
			if (j % 2 == 0) {
				while (i < arr.length) {
					System.out.print(arr[i][j] + " ");
					i++;
				}
				i--;
			}

			else {
				while (i >= 0) {
					System.out.print(arr[i][j] + " ");
					i--;
				}
				i++;
			}
			System.out.println();
			j++;
		}

	}

	public static void ZigZagRev(int[][] arr) {

		int i = arr.length-1, j = arr[0].length-1;
		while (j >= 0) {
			if (j % 2 != 0) {
				while (i >= 0) {
					System.out.print(arr[i][j] + " ");
					i--;
				}
				i++;
			}

			else {
				while (i < arr.length) {
					System.out.print(arr[i][j] + " ");
					i++;
				}
				i--;
			}
			System.out.println();
			j--;
		}
	}
	
	public static void SnakeTraversal(int[][] arr) {
		
		int i=0, j=0;
		while(i<arr.length) {
			if(i%2==0) {
				while(j<arr[i].length) {
					System.out.print(arr[i][j]+" ");
					j++;
				}
				j--;
			}
			
			
			else {
				while(j>=0) {
					System.out.print(arr[i][j]+" ");
					j--;
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, 
									{ 5, 6, 7, 8 }, 
									{ 9, 10, 11, 12 } };
														
		//ZigZag(arr);
		//ZigZagRev(arr);
		SnakeTraversal(arr);
		
	}

}
