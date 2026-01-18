package array_Practise_Sheet1;

import java.util.Scanner;
public class TwoDigitElements {
	
	public static void cal(int[] arr) {
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]/10 != 0 && arr[i]/10 <10) {
				count++;
				
			}
		}
		
		int[] newArr = new int[count];
		count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]/10 != 0 && arr[i]/10 <10) {
				newArr[count] = arr[i];
				count++;
			}
			
		}
		
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Please enter the size of the array: ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Please enter the elements of the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		cal(arr);
	}

}
