package operations1;
import java.util.ArrayList;

public class Creation {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		System.out.print("[");
		for(int i=0; i<list.size()-1; i++) {
			System.out.print(list.get(i)+", ");
		}
		System.out.print(list.get(list.size()-1)+"]");
		
	}

}
