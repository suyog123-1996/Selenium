package method;

public class Assignment3 {

	public static void main(String[] args) {
		Assignment3.evenNumber(100);

	}
	private static void evenNumber(int num1)
	{
		for(int i=1;i<=num1;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Numbers Are " +i);
			}
		}
		
	}

}
