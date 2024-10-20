package condition;

public class Assignment6 {
		//Reverse a number
	public static void main(String[] args) {
	int num=12345,rev=0;
	for(;num>0;num=num/10)
	{
		int rem=num%10;
		rev=rev*10+rem;
	}
		System.out.println("Reverse number is "+rev);
	}

		
}
/*
  remainder =num%10         rev=rev*10+rem 
 
  						    
 * remainder =12345%10=5	rev=0*10+5
 * 5 =1234%10=4		        5=5*10+4=50+4=54
 * 4 =123%10=3		        54=54*10+3=540+3=543
 * 3 =12%10 =2              543=543*10+2=5430+2=5432
 * 2=1%10=1                 5432=5432*10+1=54320+1=54321
 * 1						54321 is a output
 * */
