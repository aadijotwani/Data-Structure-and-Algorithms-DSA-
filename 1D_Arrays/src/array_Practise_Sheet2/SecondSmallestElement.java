package array_Practise_Sheet2;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		int[] arr = new int[] {12, 35, 36, 10, 34, 1};
		int first = arr[0], sec=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(first >= arr[i]) {
				sec = first;
				first = arr[i];
			}
			else if (arr[i] < sec && sec != first) {
				sec = arr[i];
			}
		}
		
		if(sec == arr[0])
		{
			sec = -1;
		}
		
		System.out.println(sec);
		

	}

}
