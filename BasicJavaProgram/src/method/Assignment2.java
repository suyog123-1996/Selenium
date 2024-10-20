package method;

public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		
		Assignment2.primeNumber(10);
		System.out.println("Program End");

	}
		static int primeNumber(int num) {
	
		int count=0,i;
		for(i=1;i<=num;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==2)
		{
				System.out.println("Given number is Prime "+num);
		}
		else {
			System.out.println("Given number is not Prime "+num);
		}return num;
		
	}
}
