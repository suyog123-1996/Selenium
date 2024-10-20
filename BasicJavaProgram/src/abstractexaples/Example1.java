package abstractexaples;
			//hierarichal inheritance
abstract class demo2{
	abstract void sample();

	void display() {
		System.out.println("im parent display");
	}
		
}
class demo3 extends demo2{
	void sample() {
		System.out.println("i am demo3 abstract class method");
	}
	
}
class demo4 extends demo2{
	void sample() {
		System.out.println("i am demo4 abstract class method");
	}
}

public class Example1 {

	public static void main(String[] args) {
		demo3 d3=new demo3();
		d3.display();
		d3.sample();
		demo4 d4=new demo4();
		d4.display();
		d4.sample();
		
	}

}
