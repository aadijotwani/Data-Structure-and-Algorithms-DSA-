package stringImplementation;

public class equals {

	public static void main(String[] args) {
		
		String str = "Bhopal";
		String str1 = "Bhopal";
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		System.out.println(str1.equals(str));

	}

}
