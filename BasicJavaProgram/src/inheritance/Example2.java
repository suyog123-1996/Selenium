package inheritance;

class A{
	//defacult constructor and super()
	void myhome(){
		System.out.println("Hello im class A method");
	}
}
class B extends A{
	//defacult constructor and super()
	void mycar(){
		System.out.println("Hello im class B method");
	}
}
class C extends B{
	//defacult constructor and super()
	void mybike(){
		System.out.println("Hello im class C method");
		
	}
	
}

public class Example2 {

	public static void main(String[] args) {
	System.out.println("*********************");
	C ref=new C();
	ref.myhome();
	ref.mycar();
	ref.mybike();

	}

}
