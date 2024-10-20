package overriding;
class Animal1{
	 Animal1(){
		}
	void bark() {
		System.out.println("im Animal1 bark");
		
	}
}
class dog1 extends Animal1{
	dog1(){
		super();
	}
	void bark() {
		System.out.println("hii im dog 1 barking");
	}
	void display() {
		System.out.println("i am display");
	}
	
}

public class Override {
	public static void main(String[] args) {
		dog1 ref=new dog1();
		ref.bark();
		ref.display();
		Animal1 ref1=new dog1();
		ref1.bark();

	}

}
