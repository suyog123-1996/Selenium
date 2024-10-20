package day3variable;

public class Practise {
	static int num1=20,num2=20;
	double num3=60,num4=43;

	public static void main(String[] args) {
		int result=num1+num2;
		System.out.println("Static Varaiable Num1= "+Practise.num1);
		System.out.println("Static Varaiable Num2= "+Practise.num1);
		System.out.println("Result= "+result);
		
		Practise xyz = new Practise();
		double result1= xyz.num3-xyz.num4;
		System.out.println("Non Static Varaiable Num3= "+xyz.num3);
		System.out.println("Non Static Varaiable Num4= "+xyz.num4);
		System.out.println("Result= "+result1);

	}

}
