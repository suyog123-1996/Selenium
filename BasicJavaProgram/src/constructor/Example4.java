package constructor;

public class Example4 {
				//this statement
	Example4(){
		this(20);
		System.out.println("hi i am void constructor");
	}
	Example4(int num){
		System.out.println("hi i am int constructor");
		System.out.println(num);
	}
	
	
	
	
	public static void main(String[] args) {
		Example4 ref=new Example4();
		ref.statement();
	}
	void statement() {
		System.out.println("hi i am void method");
	}
}
