package collection;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("Pune");//String --Auto-Upcasting--> to Object class
		l1.add("Delhi");
		l1.add("Mumbai");
		l1.add("Bangalore");
		System.out.println("List l1 elements: "+l1);
		System.out.println("Total element count in list: "+l1.size());
		
		System.out.println(l1.contains("Delhi"));
		System.out.println(l1.isEmpty());
		
		System.out.println("********************");
		System.out.println("Remove element from index 1: "+l1.remove(1));
		System.out.println("List of element: "+l1);
		System.out.println("count of element: "+l1.size());
		System.out.println("Remove element based on object "+l1.remove("Delhi"));
		System.out.println("List of element: "+l1);
		System.out.println("count of element: "+l1.size());
		
		System.out.println("***********************");
		l1.clear();
		System.out.println("List of element: "+l1);
		System.out.println("count of element: "+l1.size());
		
		
	}

}
