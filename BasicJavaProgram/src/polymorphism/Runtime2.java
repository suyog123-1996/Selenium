package polymorphism;
class car {
	int price=2500;
	void run() {
		System.out.println("running");
	}
}
class suzuki extends car{
	int price=6000;
}

public class Runtime2 {

	public static void main(String[] args) {
		car c=new suzuki();//no run time poly because -inheritance-upcasting-no overriding
		c.run();
		System.out.println(c.price);

	}

}
