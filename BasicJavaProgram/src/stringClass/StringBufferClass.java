package stringClass;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Original String value:"+sb);
		
		sb.append(" Java");
		System.out.println(sb);//Hello Java
		
		sb.insert(5, "Pune");
		System.out.println(sb);//HelloPune Java
		
		sb.replace(1, 3, "XXX");
		System.out.println(sb);//HXXXloPune Java
		
		sb.delete(1, 4);
		System.out.println(sb);//HloPune Java
		
		StringBuffer s1=new StringBuffer("Bangalore Known For IT");
		s1.reverse();
		System.out.println(s1);
		System.out.println("*********************");
		
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());//default capacity=16
		
		s2.append("Hello");
		System.out.println("First word: "+s2);
		System.out.println("First word capacity: "+s2.capacity());//16
		
		s2.append("Java Is My favourite Language");
		System.out.println("2nd word: "+s2);
		System.out.println("2nd word capacity: "+s2.capacity());//now (16*2)+2=34  (oldcapacity*2)+2    
		
		s2.append("I am from automation area ");
		System.out.println("3rd word: "+s2);
		System.out.println("3rd word capacity: "+s2.capacity());//now (34*2)+2=70; (oldcapacity*2)+2   
		
		
		
	}

}
