package methods;

public class Example2 {
	
	
	static public void main(String []args) {
		System.out.println("Create Object to access non static method");
		Example2 ref=new Example2();
		ref.addition();
		
		
		System.out.println("**********to access static method********");
		Example2.multiplication();
		double Result=Example2.multiplication();
		System.out.println(Result);
	}
	protected int addition() {
		int a=20,b=30,add;
		add=a+b;
		return add;
	}
	static double multiplication() {
		int a=20,b=5;
		double res;
		res=a*b;
		return res;
	}

}
