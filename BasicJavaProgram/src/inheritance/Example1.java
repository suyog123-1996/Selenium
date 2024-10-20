package inheritance;


class Grandfather{
	//default constructor with default super()
	int num1=505;
	void Demo1() {
		System.out.println("hi i am demo1 constructor");
	}
}
class Father extends Grandfather{
	//default constructor with default super()
	int num2=303;
	void Demo2() {
		System.out.println("hi i am demo2 constructor");
	}
	
}
class Child extends Father{
	
	int num3=101;
	void Demo3() {
		System.out.println("hi i am demo3 constructor");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
			Child s1=new Child();
			s1.Demo3();
			s1.Demo2();
			s1.Demo1();
	}

}
