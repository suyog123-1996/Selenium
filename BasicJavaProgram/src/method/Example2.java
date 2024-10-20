package method;

public class Example2 {

	public static void main(String[] args) {
	/*additionNumber();	
	//Example2.additionNumber();
	//int Result=Example2.additionNumber();
	Example2 ref=new Example2();
	ref.getNumber(321);
	//int res=ref.getNumber(12345);
	//System.out.println(res);
	ref.getReverseNumber(121);
	int res1=ref.getReverseNumber(122);
	*/
		Example2 ref=new Example2();
		ref.reverseNumber1(321);
		//System.out.println(ref.reverseNumber1(987));
	}
	static void additionNumber()
	{
		int X=20,Y=30,sum;
		sum=X+Y;
		System.out.println(sum);
	}
	void getNumber(int num1)
	{
		int rem,rev=0;
		for(;num1>0;)
		{
			rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		System.out.println(rev);
	
	}
	int getReverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
}
	void reverseNumber1(int num1) {
		int rem,rev=0;
		System.out.println("Initial number: "+num1);
		for(;num1>0;)
		{
			rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		System.out.println(rev);
	}

}
