package abstractexaples;
abstract class demo{
	abstract void demo();
}
class demo1 extends demo{
	void demo() {
		System.out.println("Hello im abstract overrider");//100% abstract class
	}
	void display() {
		System.out.println("hello im display method");
	}
}

public class Example {

	public static void main(String[] args) {
		//demo ref=new demo(); because of abstract class you caannot make an object
		demo1 d1=new demo1();//child class object has been creted
		d1.demo();
		d1.display();
		demo d2=d1;
		d2.demo();
	}

}
