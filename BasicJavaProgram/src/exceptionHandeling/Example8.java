package exceptionHandeling;

import java.text.NumberFormat;

public class Example8 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int res[]=new int[3];
		try {
		res[3]=10/0;//normal statement//On RHS there is an Arithmetic Exception
		System.out.println("Result is: "+res);
		}//using catch ladder
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();//Complete Exception as it is
		}catch(ArithmeticException e) {
			e.printStackTrace();//Complete Exception as it is
		}catch(Exception e) {
			e.printStackTrace();//Complete Exception as it is
		}
		try {
			res[3]=10/2;//normal statement//Array String contain indexing from 0,1,2
			System.out.println("Result is: "+res);
			}//using catch ladder
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();//Complete Exception as it is
			}catch(ArithmeticException e) {
				e.printStackTrace();//Complete Exception as it is
			}catch(Exception e) {
				e.printStackTrace();//Complete Exception as it is
			}
		System.out.println("Program Ends");
		
		
		
		
		
		
		
	}

}
