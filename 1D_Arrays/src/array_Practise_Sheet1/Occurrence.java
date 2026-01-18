package array_Practise_Sheet1;

import java.util.Scanner;
public class Occurrence {
	
	public static void specificOccurence(int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		System.out.print("Please enter a number: ");
		int n = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(n == arr[i]) 
				count++;
		}
		
		System.out.println("Occurence of "+n+" is "+count+" times");
	}
	
	public static void Occurence(int[] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		boolean check;
		
		for(int i=0; i<arr.length; i++) {
			count=0;
			check= false;
			for(int j=i-1; j>=0; j--) {
				if(arr[i] == arr[j]) {
					check=true;
					break;
				}
			}
			if(check == false) {
				for(int k=0; k<arr.length; k++) {
					if(arr[i] == arr[k]) {
						count++;
					}
				}
				System.out.println("Occurence of "+arr[i]+" is "+count+" times");
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 3, 6, 3, 6, 3 };
		
//		specificOccurence(arr);
//		System.out.println("\n");
		Occurence(arr);
		
		

	}

}
