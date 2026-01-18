package operations2;

import java.util.ArrayList;

public class IndexCheck {

	public static void main(String[] args) {
			
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		int search = 2;
		int index = list.indexOf(search);
		
		System.out.println(index);

	}

}
