package stringClass;

public class Example4 {

	public static void main(String[] args) {
		//Replacing Character
		String str1="CoreJavaBasic";
		System.out.println("Original string: "+str1);
		//to replace old character with new character
		String str2=str1.replace('a', 'x');
		System.out.println("Replaced String: "+str2);
		
		String str3=str1.replace("Java", "Net");
		System.out.println("Replaced String: "+str3);
		
		String str4=str1.replaceFirst("a", "w");
		System.out.println("Replaced String: "+str4);
		
		String str5="a";
		System.out.println("Given string is Empty or not: "+str5.isEmpty());
		
		String str6=new String();
		System.out.println("Given string is Empty or not: "+str6.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
	}

}
