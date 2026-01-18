package array_Practise_Sheet1;

public class Traversal {

	public static void StoE(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void EtoS(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void StoHALF(int[] arr) {
		for (int i = 0;  arr.length%2==0 ?  i<arr.length/2 : i<=arr.length/2; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void EtoHALF(int[] arr) {
		for(int i=arr.length-1; i>=arr.length/2; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
	}
	

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6};
		StoE(arr);
		EtoS(arr);
		StoHALF(arr);
		EtoHALF(arr);

	}

}
