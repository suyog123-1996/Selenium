package constructor;

public class Example5 {
	Example5 (){
		this(20);//this stetement is used to call different constructor of a class based on parameter
		//this should be the first statement in the constructor.
		System.out.println("i am zero parameter constructor");
	}
	Example5(int num){
		System.out.println("I am int paraametre constructor");
		addition(20,30);
	}

	public static void main(String[] args) {
		Example5 ref= new Example5();
		
	}
	void addition(int num1, int num2) {
		
		int res=num1+num2;
		System.out.println("Addition of two number is "+res);
		
	}

}
