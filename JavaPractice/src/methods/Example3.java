package methods;

public class Example3 {
	
	
	static public void main(String []args) {
		System.out.println("Create Object to access non static method");
		Example3 ref=new Example3();
		ref.addition(1500, 1500);
		
		System.out.println("**********to access static method********");
		double res=Example3.multiplication(20, 3);
		
		Example3.getReverseNumber();
		
	}
	protected int addition(int a,int b) {
		int add;
		add=a+b;
		return add;
	}
	static double multiplication(double a,int b) {
		
		double res;
		res=a*b;
		return res;
	}
	static void getReverseNumber() {
		int num,rem;
		int rev=0;
		for (num=123;num>0;num=num/10) {
			rem=num%10;
			
			rev=rev*10+rem;
		}
		System.out.println("Reverse Number is: "+rev);
		
	}

}
