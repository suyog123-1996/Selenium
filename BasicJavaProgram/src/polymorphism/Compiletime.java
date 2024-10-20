package polymorphism;

public class Compiletime {
	static void sum(int a,int b) {
		int c=a+b;
		System.out.println("Addition of two number: "+c);
	}
	static void sum(int a, int b, int d) {
		int c=a+b+d;
		System.out.println("Addition of three number: "+c);
	}

	public static void main(String[] args) {
		Compiletime.sum(10, 20, 30);
	}

}
/*
When a method gets to know its implementation at the time of compilation is known as compile
time polymorphism this can be achieved by static method overloading

*/