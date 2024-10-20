package method;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		//method will be executed but you wont be able to see return value
		//getReverseNumber()
		//System.out.println("Reverse value: " +getReverseNumber(12345));
		int res=getReverseNumber();
		// method body will be executed and return value store in the
			// in the variable for future use.
		System.out.println("Result=" +res);
				
		System.out.println("Program End");

	}
	static int getReverseNumber()
	{
		int num=123, rem,rev=0;
		for(;num>0;) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	
	}

}
