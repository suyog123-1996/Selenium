package abstractexaples;
abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	protected void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle extends shape{
	public void draw() {
		System.out.println("drawing circle");
	}
}

public abstract class Example3 {

	public static void main(String[] args) {
		circle c1=new circle();
		c1.draw();
		rectangle r1=new rectangle();
		
		r1.draw();
	}

}
