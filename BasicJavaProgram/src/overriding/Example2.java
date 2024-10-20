package overriding;
class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		System.out.println("Dogs can walk and run");
		display();
		// Animal2 a1 = new Animal2();//instance of Animal2 class
		// a1.move(); //or
		super.move();		
	}
}
public class Example2 {

	public static void main(String[] args) {
		Dog2 ref=new Dog2();
		ref.move();

	}

}
