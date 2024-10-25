package Method;

public class Example3 {

	public static void main(String[] args) {
		//Example.additionOfNumber(20,30);
		additionOfNumber(20,30);
		additionOfNumber(20,30.50);
		additionOfNumber(20.50,30);
		
	}
	 static void  additionOfNumber(int num1,int num2)
	{
		int sum=0;
		sum=num1+num2;
		System.out.println(sum);
		
	}
	 static void  additionOfNumber(int num1,double num2)
		{
			double sum=0;
			sum=num1+num2;
			System.out.println(sum);
		}
	 static void  additionOfNumber(double num1,int num2)
		{
			double sum=0;
			sum=num1+num2;
			System.out.println(sum);
		}

	}


