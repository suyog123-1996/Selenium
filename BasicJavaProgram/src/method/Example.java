package method;

public class Example {

	public static void main(String[] args) {
		System.out.println("Program Start");
		
		Example.addition();
		System.out.println("******************");
		Example.additionOfTwoNumber(20,-30);
		System.out.println("******************");
		Example.additionOfTwoNumber(20,20);
		System.out.println("Program End");
	}
		static void addition ()
		{
			int num1=20,num2=30,res=num1+num2;
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(res);

			
		}
		static void additionOfTwoNumber (int num1,int num2)
			{
				int res=num1+num2;
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(res);
		
			}
	

}
