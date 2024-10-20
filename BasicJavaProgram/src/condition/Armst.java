package condition;

public class Armst {

	public static void main(String[] args) {
		int num = 153; // Input Number
		int copy = num; // Copy of Input Number
		int b = 0;
		int temp = 0;

		while (num >0) //153>0 || 15>0 || 1>0
		{
			b = num % 10;//153%10=3|| 15%10=5 || 1%10=0
			temp = temp + b * b * b;
			//0=0+3*3*3=27|| =27+5*5*5=27+125=153 || 153+0
			num = num / 10;
			//153/10=15 || 15/10=1   

		}

		if (copy == temp)
		{
			System.out.println(copy + " is an Armstrong number");
		}
		else 
		{
			System.out.println("No! " + copy + " is not an Armstrong number");
		}


	}

}
