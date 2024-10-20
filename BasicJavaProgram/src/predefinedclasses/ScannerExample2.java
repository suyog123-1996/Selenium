package predefinedclasses;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		String name;
		char grade;
		double p,interest,r;
		int t;
		Scanner scn = new Scanner(System.in);
		System.err.println("Please Enter your name");
		name=scn.next();//For string you need to use a only next() method
		System.err.println("Please Enter your grade");
		grade=scn.next().charAt(0);//for char use this method //it helps to read a single character
		System.err.println("Please Enter your Principle");
		p=scn.nextDouble();
		System.err.println("Please Enter your ROI");
		r=scn.nextDouble();
		System.err.println("Please Enter your Duration");
		t=scn.nextInt();
		
		interest=(p*r*t)/100;
		System.out.println("candidate name is "+name);
		System.out.println("candidate garde is "+grade);
		System.out.println("Principle amount is "+p);
		System.out.println("ROI is "+r);
		System.out.println("Duration is "+t);
		System.out.println("Interest amount is "+interest);
		
		scn.close();//best practise says to write this
		
	}

}
