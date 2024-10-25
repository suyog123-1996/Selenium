package Method;

public class Example1 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		int Res=ref.additionOfNumber(5);
		System.out.println(Res);
	}
	int  additionOfNumber(int num)
	{
		int i,sum=0;
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;	
	}
		
}
