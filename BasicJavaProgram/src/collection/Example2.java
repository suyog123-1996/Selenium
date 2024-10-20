package collection;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("Pune");
		l1.add(123);
		l1.add("Pune");
		l1.add(null);
		l1.add("Mumbai");
		System.out.println("List l1 Element: "+l1);
		System.out.println("size of element: "+l1.size());
		List l2=new ArrayList();
		l2.add("Apple");
		l2.add("MAngo");
		l2.add("Banana");
		System.out.println("List l2 Element: "+l2);
		System.out.println("size of element: "+l2.size());
		
		//to add collection element into another element
		l1.addAll(l2);
		System.out.println("After adding List of l1 Element: "+l1);
		System.out.println("After adding count of l1 element: "+l1.size());
		
		l1.removeAll(l2);
		System.out.println("After removing List of l1 Element: "+l1);
		System.out.println("After removing count of l1 element: "+l1.size());
		
		System.out.println("*****add all with index******");
		l1.addAll(2, l2);
		System.out.println("After add with index List of l1 Element: "+l1);
		System.out.println("After add with index count of l1 element: "+l1.size());
		
		l1.removeAll(l2);
		System.out.println("After removing List of l1 Element: "+l1);
		System.out.println("After removing count of l1 element: "+l1.size());
		
		
		
		
		
		
		
		
		
	}

}
