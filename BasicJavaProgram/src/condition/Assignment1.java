package condition;

public class Assignment1 {
	// Largest among three number
	public static void main(String[] args) {
		int x=65,y=2,z=18;
		if(x>=y && x>=z )
		{
		System.out.println("Largest number is "+x);	
		}
		else if(y>=x && y>=z)
		{
		System.out.println("Largest number is "+y);	
		}
		else
		{
			System.out.println("Largest number is "+z);	
		}

	}

}
