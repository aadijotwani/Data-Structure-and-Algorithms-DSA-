package operations2;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		Collections.copy(list1, list2);
		System.out.println(list1);
		System.out.println(list2);
		
		
		
	}

}
