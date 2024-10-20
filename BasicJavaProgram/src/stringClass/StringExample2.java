package stringClass;

public class StringExample2 {

	public static void main(String[] args) {
		String s1="I am from Maharashtra, I am working in accenture, I am working as a QA Delivery Head";
		System.out.println("Actual String :"+s1);
		String []StrAry=s1.split(" ");
		for(String s:StrAry) {
			System.out.println(s);
		}
		String s2="Username : Admin";
		System.out.println("Actual String "+s2);
		String[]StrAry2=s2.split(" ", 1);
		for(String s:StrAry2) {
			System.out.println(s);
		}
		String s3="I am from Chandrapur";
		System.out.println("original string: "+s3);
		String[] StrAry3=s3.split(" ");
		//for reverse statement
		String temp=" ";
		for (int i=StrAry3.length-1;i>=0;i--) {
			temp=temp+" "+StrAry3[i];
		}
		System.out.println("Reverse Statement: "+temp);// Chandrapur from am I

		
		String s4="    I am Suyog       ";
		System.out.println("Actual String with Spaces: "+s4);
		
		System.out.println("Actual string with length: "+s4.length());
		//to remove all prefix spaces and postfix spaces use trim()
		System.out.println("Actual String without spaces: "+s4.trim());
		
		System.out.println("Actual string length without spaces: "+s4.trim().length());
		
		String s5="I    am     Suyog";
		//trim method will not remove a spaces between the words
		System.out.println("Actual String with Spaces s5: "+s5);
		
		System.out.println("Actual string with length s5: "+s5.length());//17
		
		System.out.println("Actual String without spaces s5: "+s5.trim());
		
		System.out.println("Actual string length without spaces s5: "+s5.trim().length());//17
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
