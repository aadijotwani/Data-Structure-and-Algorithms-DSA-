package array_Practise_Sheet2;

public class ElementSwap {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50, 60};
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
