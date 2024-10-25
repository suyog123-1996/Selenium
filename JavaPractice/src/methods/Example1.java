package methods;

public class Example1 {

	 static public void  main(String[] args) {
		 System.out.println("Create Object to access non static method");
		Example1 ref=new Example1();
		
		ref.show();//This is show method
		
		System.out.println("**********to access static method********");
		
		
		Example1.display();//This is display method
		
		
	}
	public void show() {
		System.out.println("This is show method");
	}
	static void display() {
		System.out.println("This is display method");
	}

}
