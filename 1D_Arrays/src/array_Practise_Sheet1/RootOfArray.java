package array_Practise_Sheet1;

public class RootOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1,4,9,16,25};
		int[] arr1 = {1,8,27,64,125};
		int[] sqrArr = new int[arr.length];
		int[] cubeArr = new int[arr1.length];
		
		for(int i=0; i<arr.length; i++) {
			sqrArr[i] = (int) Math.sqrt(arr[i]);
			cubeArr[i]= (int) Math.cbrt(arr1[i]);
		}
		
		System.out.print("Square Root is: ");
		for(int i=0; i<sqrArr.length; i++) {
			System.out.print(sqrArr[i]+" ");
		}
		System.out.println();
		System.out.print("Cube Root is: ");
		for(int i=0; i<cubeArr.length; i++) {
			System.out.print(cubeArr[i]+" ");
		}
		

	}

}
