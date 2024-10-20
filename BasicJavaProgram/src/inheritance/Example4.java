package inheritance;
class Demo9{
		//overriding
	int num=10;
	void calling() {
		System.out.println("I am calling from Demo1....");
	}
}
public class Example4 extends Demo9{
	@Override
	void calling() {
		System.out.println("Overried in Example2, I am calling from Example2....");
	}
	void display() {
		System.out.println("Hello, I am displaying data of Example2....");
	
	}
	public static void main(String[] args) {
		Example4 ref=new Example4();
		ref.calling();
		ref.display();
		System.out.println("*******************");
		Demo9 ref1=new Example4();
		ref1.calling();
	}

}
