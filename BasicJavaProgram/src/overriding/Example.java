package overriding;
class demo1{
	int num=20;
	void dog() {
		System.out.println("im demo1 dog method");
	}
}	
public class Example extends demo1{
	int num=30;
	void dog() {
		System.out.println("im demo2 dog method");
	}
	void display() {
		System.out.println("im demo2 display method");
//		demo1 ref=new demo1();
//		System.out.println("variable from demo1= "+ref.num);
//		ref.dog();
//				or
		super.dog();
		System.out.println("variable calling from demo1= "+super.num);
	}

	public static void main(String[] args) {
		Example ref1=new Example();
		ref1.display();

	}

}
