package condition;

public class Assignment2 {
		//Leap year 
	public static void main(String[] args) {
		int x=2100;
		if (x%4==0 && x%100!=0)
		{
			System.out.println("Current year is Leap Year= "+x);
		}
		else
			System.out.println("Current year not a is Leap Year= "+x);
	}

}
