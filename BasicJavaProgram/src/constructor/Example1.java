package constructor;

public class Example1 {
	int num,num2;
	Example1(){
		System.out.println("*************");
		num=20;
		num2=30;
		System.out.println(num);
		System.out.println(num2);
	}
	Example1(int num,int num2){
		System.out.println("******************");
		System.out.println(num);
		System.out.println(num2);
		System.out.println("**calling method********");
		addition(50,30);
	}

	public static void main(String[] args) {
		int num=30;
		System.out.println(num);
		Example1 ref=new Example1();
		Example1 ref1=new Example1(20,30);
		System.out.println("*************");
		ref.num=60;
		System.out.println(ref.num);
	}
	void addition(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println(sum);
	}

}
