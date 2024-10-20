package inheritance;
		
class Demo4{
	Demo4(){
		System.out.println("i am Demo1 constructor");
	}
	void myhome(){
		System.out.println("i am Demo1 method");
		}
}
class Demo5 extends Demo4{
	Demo5(double num2){
		System.out.println("i am Demo2 constructor");
	}
	void mycar(){
		System.out.println("i am Demo2 method");
		}
}
class Demo6 extends Demo5{
	Demo6(int num1){
		super(33.52);
		System.out.println("i am Demo3 constructor");
		
	}
	void mybike(){
		System.out.println("i am Demo3 method");
	}

}

public class Example3 {

	public static void main(String[] args) {
		Demo6 ref=new Demo6(21);
		ref.myhome();
		ref.mybike();
		ref.mycar();
		Demo5 ref2=new Demo5(33.42);
		ref2.mycar();
	//  ref2.mybike(); cannot access because of it is child property
		ref2.myhome();
		
		Demo4 ref3=new Demo4();
		//ref3.mycar();cannot access because of it is child property
		ref.myhome();
		//
	}

}
