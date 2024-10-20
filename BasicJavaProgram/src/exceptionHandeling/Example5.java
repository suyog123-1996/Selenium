package exceptionHandeling;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		int res;
		
		try {
		res=10/0;//normal statement
		System.out.println("Result is: "+res);
		}
		catch(ArrayIndexOutOfBoundsException e)//Program will be terminated because catch blockwont able to handle it
		//as we know in try blow there is and ArithmeticException and we are writing a
		//ArrayIndexOutOfBoundsException so it wont handle and program will terminated
		{
//			System.out.println("Exception message: "+e.getMessage());//for msg
//			System.out.println("Exception class and message: "+e);//for class and msg
			e.printStackTrace();//Complete Exception as it is
		}
		System.out.println("Program Ends");
		
		
		
		
		
		
		
	}

}
