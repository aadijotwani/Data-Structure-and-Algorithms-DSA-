package selectionSort;

public class Beginning {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 2, 5, 10, 11, 13 };

		for (int i = 0; i < arr.length - 1; i++) {
			int s = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[s] > arr[j]) {
					s = j;
				}
			}
			int temp = arr[i];  
			arr[i]= arr[s];
			arr[s]= temp; 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
