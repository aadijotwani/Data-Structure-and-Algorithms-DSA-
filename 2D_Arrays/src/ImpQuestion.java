

public class ImpQuestion {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		int i=0;
		int j=i+1;
		
		System.out.println("Orignal Array");
		for(int k=0; k<arr.length; k++) {
			for(int l=0; l<arr[0].length; l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("Array Rotation");
		while(j<arr[0].length) {
			int temp = arr[i][j];
			arr[i][j] = arr[0][0];
			arr[0][0] = temp;
			j++;
		}
		j--;
		i++;
		while(i<arr.length) {
			int temp = arr[i][j];
			arr[i][j] = arr[0][0];
			arr[0][0] = temp;
			i++;
		}
		i--;
		j--;
		while(j>=0) {
			int temp = arr[i][j];
			arr[i][j] = arr[0][0];
			arr[0][0] = temp;
			j--;
		}
		j++;
		i--;
		while(i>0) {
			int temp = arr[i][j];
			arr[i][j] = arr[0][0];
			arr[0][0] = temp;
			i--;
		}
		
		
		for(int k=0; k<arr.length; k++) {
			for(int l=0; l<arr[0].length; l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
	}

}
