package condition;

public class Assignment10 {
//			factorial of +ve integer
	public static void main(String[] args) {
		int num=5, fact=1 ;
		for(int i=1;i<=num;i++)
		{
			 fact=fact*i;
		}
			System.out.println("factorial Number is: "+fact);
			//OR METHOD
			{	
			int num1=5,fact1=1;
			for (int i=num1; i>=1;i--)
			{
				fact1=fact1*i;
			}
			System.out.println("factorial Number is: "+fact1);
			} 

	}

}
