package predefinedclasses;

import java.util.Scanner;

public class SacannerExample {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	
	}

}
