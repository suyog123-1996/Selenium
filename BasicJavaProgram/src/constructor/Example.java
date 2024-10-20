package constructor;

public class Example {
	Example(){
		System.out.println("Hiiiii");
	}
	Example(int num){
		num=7;
		System.out.println(num);
	}
	
	
	//int num;
	public static void main(String[] args) {
		Example ref=new Example();
		ref.primeNumber(7);
		System.out.println("****************");
		Example ref1=new Example(7);
	}
	int primeNumber(int num) {
		int i,count=0 ;
		//Example ref=new Example();
		//ref.num=7;
		for(i=1;i<=num;i++)
		{
			if(num%10==0) {
				count++;
			}
		
		}
		if(count==2) {
			System.out.println("Given Number Prime is   "+num);
		}
		else
		{
			System.out.println("Given Number Prime is   "+num);
		}
		return count;
	}
	

}
