package method;

public class Example4 {
				//Method overloading
	public static void main(String[] args) {
		additionNumber();
		additionNumber(20.50,30);
		additionNumber(20,20);
	}
	static void additionNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println(res);
	}
	static void additionNumber(int num1,int num2) {
		//int num1=20,num2=30,res;
		int res=num1+num2;
		System.out.println(res);
	}
	static void additionNumber(double num1,int num2) {
		//int num1=20,num2=30,res;
		double res=num1+num2;
		System.out.println(res);
	}
	static void additionNumber(int num1,double num2) {
		//int num1=20,num2=30,res;
		double res=num1+num2;
		System.out.println(res);
	}



}
