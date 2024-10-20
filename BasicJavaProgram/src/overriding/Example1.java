package overriding;
class Animal{
	int num=808;
	void main() {
		System.out.println("im main method of Animal");
	}	
}

public class Example1 extends Animal {
	int num=303;
	void main() {
		System.out.println("im main method of cow");
		
	}
	void display() {
		System.out.println("**************");
		super.main();
		System.out.println("variable calling from Animal=  "+super.num);
	}

	public static void main(String[] args) {
		Example1 ref=new Example1();
		ref.display();
	}

}
