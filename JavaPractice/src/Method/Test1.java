package Method;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		t1.show();
		
		System.out.println("******************");
		t1.show(20, 30);
		System.out.println("******************");
		t1.show(20, 5.0);
		System.out.println("******************");
		t1.show(20.0, 2);
		
		
		
		
	}
	void show () {
		System.out.println("i am zero param method");
	}
	void show (int num1,int  num2) {
		System.out.println(num1);
		System.out.println(num2);
		int res=num1+num2;
		System.out.println("addition of two number is: "+res);
	}
	void show (int num1,double num2) {
		System.out.println(num1);
		System.out.println(num2);
		double res=num1*num2;
		System.out.println("Multiplication of two number is: "+res);
		
	}
	void show (double num1,int  num2) {
		System.out.println(num1);
		System.out.println(num2);
		double res=num1-num2;
		System.out.println("Substraction of two number is: "+res);
	}

}
