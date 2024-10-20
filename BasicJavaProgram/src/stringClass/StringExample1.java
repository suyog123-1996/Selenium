package stringClass;

import java.util.Scanner;

public class StringExample1 {

	public static void main(String[] args) {
		
		String str1="DhanoriPune";
		char c=str1.charAt(5);//to find char based on index used charAt() method;
		System.out.println("char at index 5: "+c);
		//to print one by one character of string
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		//to print one by one character of the string from last index
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
		}
		//To reverse the string
		String temp=" ";
		for(int i=str1.length()-1;i>=0;i--) {
			temp=temp+str1.charAt(i);
		}
		System.out.println("original string "+str1);
		System.out.println("Reverse string "+temp);//enuPironahD
		System.out.println(reverseString ("Mumbai"));
		String s1="Nagpur";
		System.out.println(reverseString(s1));
		Scanner s2=new Scanner(System.in);
		String s3;
		System.out.println("Enter reverse number");
		s3=s2.next();
		System.out.println("Reverse string : "+reverseString(s3));
		
		
		

	}
		static String reverseString(String str1) {
		String temp=" ";
		for (int i=str1.length()-1;i>=0;i--) {
			temp=temp+str1.charAt(i);
		}
		return temp;
	}
		static void palindromeString(String str1) {
			String s4=str1;
			String temp=" ";
			for (int i=str1.length()-1;i>=0;i--) {
				temp=temp+str1.charAt(i);
			}
			if (temp.equals(s4)) {
				System.out.println("Given string is palindrome "+temp);
			}
			else {
				System.out.println("Given string is not palindrome "+temp);
			}
		}
		
	
	

}
