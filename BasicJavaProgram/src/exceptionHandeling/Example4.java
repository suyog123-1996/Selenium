package exceptionHandeling;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		int res;
		
		try {
		res=10/5;//normal statement
		System.out.println("Result is: "+res);
		}
		catch(ArithmeticException e)//Because of normal statement catch block will wont executes
		{
//			System.out.println("Exception message: "+e.getMessage());//for msg
//			System.out.println("Exception class and message: "+e);//for class and msg
			e.printStackTrace();//Complete Exception as it is
		}
		System.out.println("Program Ends");
		
		
		
		
		
		
		
	}

}
