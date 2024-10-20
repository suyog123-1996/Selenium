package day3variable;

public class $Example {
	static int x=20,y=30;
	double p=80, q=5;

	public static void main(String[] args) {
		System.out.println("Program Start");
		int result =x+y;
		System.out.println("Result: " +result);
		$Example.x=40;
		$Example.y=35;
		int result1=x+y;
		System.out.println("X= "+$Example.x);
		System.out.println("Y= "+$Example.y);
		System.out.println("Result= "+result1);
		System.out.println("*************************");
		
		$Example abc=new $Example();
		abc.p=60;
		abc.q=5;
		double result2=abc.p%abc.q;
		
		System.out.println("Result= " +result2);
		
	}

}
