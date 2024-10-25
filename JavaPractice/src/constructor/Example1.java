package constructor;

public class Example1 {

	 Example1(){
		 System.out.println("I am Example1 constructor");
	 }
	 Example1(int num1){
		 
		 System.out.println(num1);
		 System.out.println("**************");
		 palindromNumber(123);
	 }
	public static void main(String[] args) {
		
		Example1 ref=new Example1();
		ref.palindromNumber(121);
		Example1 ref1=new Example1(456);
	}
	 void palindromNumber (int num) {
		 int rev=0, rem, temp=num;
		  for(;num>0;num=num/10) {
			  rem=num%10;
			  rev=rev*10+rem;	  
		  }
		  System.out.println(rev);
		 if(temp==rev) {
			 System.out.println("Given Number is Palindrom: "+temp);
		 }else {
			 System.out.println("Given Number is not a  Palindrom :"+temp);
		 }
		 
		 
		 
	 }

}
