package exceptionHandeling;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		int res;
		
		try {
		res=10/0;//abnormal statement
		System.out.println("Result is: "+res);
		}
		catch(ArithmeticException e)
		{
//			System.out.println("Exception message: "+e.getMessage());//for msg
//			System.out.println("Exception class and message: "+e);//for class and msg
			e.printStackTrace();//Complete Exception as it is
		}
		System.out.println("Program Ends");
		
		
		
		
		
		
		
	}

}
