
package method;

public class Assignment1 {
				//WAP for Palindrom a number
	public static void main(String[] args) {
		System.out.println("Program start");
		//palindromNumber();
		//System.out.println("Result= " +palindromNumber(562));
		
		int pal=palindromNumber(121);
		
		System.out.println("Program start");

	}
	static int palindromNumber(int num)
	{
		int rem,rev=0, temp=num;
		for(;num>0;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;
			
		}
		if (temp==rev) {
			System.out.println("Given number is Palindrom "+ rev);
		}else 
		{
			System.out.println("Given number is  not Palindrom "+ rev);
		}
		return rev;
	}
	

}
