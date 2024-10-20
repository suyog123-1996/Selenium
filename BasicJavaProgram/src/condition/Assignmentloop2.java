package condition;

public class Assignmentloop2 {

	public static void main(String[] args) {
		int num=122,rev=0,rem,temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(temp==rev) {
			System.out.println("Given number is palindrome " + rev);
		}
		else {
			System.out.println("Given number is not palindrome " + rev);
		}
	}

}
