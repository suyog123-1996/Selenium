package condition;

public class Assignment8 {
			//for palimdrom number
	public static void main(String[] args) {
		int num=1231,rev=0,temp=num;
		for(;num>0;num=num/10)
		{
			int rem=num%10;
			rev=rev*10+rem;
		}
			System.out.println(rev);
			if(temp==rev) 
			{
			System.out.println("Given number is palindrom");
			}else
				System.out.println("Given number not is palindrom");
			
	}

}
