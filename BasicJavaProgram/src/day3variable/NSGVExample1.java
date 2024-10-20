package day3variable;

public class NSGVExample1 {
	int num1,num2;

	public static void main(String[] args) {
		NSGVExample1 xyz= new NSGVExample1();
		xyz.num1=20;
		xyz.num2=100;
		int result=xyz.num1+xyz.num2;
		System.out.println("Num2: "+xyz.num2);
		System.out.println("Num1: "+xyz.num1);
		System.out.println("Result: "+result);
		

	}

}
