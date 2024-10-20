package overriding;
class A{
	int num=202;
	public void object() {
		System.out.println("im object of class A");
	}
}
class B extends A{
	int num=101;
	public void object() {
		System.out.println("variable "+num);
		
		super.object();
		System.out.println("accescing variable from A= "+super.num);
	}
}

public class Example3 {

	public static void main(String[] args) {
		B ref=new B();
		ref.object();
	}

}
