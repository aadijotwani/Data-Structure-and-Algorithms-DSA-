package array_Practise_Sheet1;

import java.util.Scanner;
public class ElementSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[] { 11, 21, 31, 41, 51 };
		boolean check = false;
		
		System.out.print("Please enter an element to search: ");
		int n = sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{
			if(n == arr[i]) {
				System.out.println("Nearest element found at index "+i);
				check=true;
				break;
			}
		}
		
		if(check == false) {
			System.out.println("No Element found");
		}
		

	}

}
