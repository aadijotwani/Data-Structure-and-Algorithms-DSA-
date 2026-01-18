package bubbleSort;

public class SquareSorted {

	public static void main(String[] args) {
		int[] arr = { -4,-1,0,3,10 };
		boolean check = false;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] *= arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			check = false;
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					check = true;
				}
			}
			if (check == false) {
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
