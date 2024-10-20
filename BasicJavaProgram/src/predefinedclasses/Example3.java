package predefinedclasses;
class Sample6{
	void Show() {
		System.out.println("i am show method");
	}
}

public class Example3 {
	static Sample6 S2=new Sample6();
	public static void main(String[] args) {
		Example3.display();
		Sample6 s1=new Sample6();
		s1.Show();
		
		
		Example3.S2.Show();
	//classname.referenceVariable.nonStaticMethodOfSample6Class
		System.out.println("Hello");
	//classname.staticReferenceVariableOfPrintStreamClass.nonStaticMethodOfPrintStream
		System.err.println("Error");
	}
	static void display() {
		System.out.println("i am display method");
	}

}
