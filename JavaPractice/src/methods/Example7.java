package methods;

public class Example7 {
	public static void main(String[]args) {
		
		Example7 ref=new Example7();
		ref.palindromNumber(121);
		
	}
	 int   palindromNumber(int num) {
		 int rev=0,rem;
		 int temp=num;
		 while(num!=0) {
			 
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 if(temp==rev) {
			 System.out.println("Given Number is Palindrome "+temp);
		 }
		 else {
			 System.out.println("Given Number is not a Palindrome "+temp);
		 }
		 return temp;
	 }
		
	

}
