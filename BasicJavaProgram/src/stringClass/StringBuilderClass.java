package stringClass;

public class StringBuilderClass {

	public static void main(String[] args) {
		/**
		 * Mutable
		 * Not a thread safe-->Multi Threading-->Fast
		 * Object will created only byusing new keyword
		 * Growable
		 */
		
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		
		System.out.println(sb1.equals(sb2));//address based comparison because equals() is not overrided
		System.out.println(sb1==sb2);//address based comparison
		
		//We dont have any method in StrinBuffer/StringBuilder to compare object value, so to overcome that
		//First convert StrinBuffer/StringBuilder to string class using toString()
		//Then use equals() of string class
		
		System.out.println((sb1.toString().equals(sb2.toString())));
		
		
		
		
		
		
	}

}
