package polymorphism;
class Animal{
	void eat() {
		System.out.println("Animal Eat");
	}
}
class herbivores extends Animal{
	void eat() {
		System.out.println("herbivores eat plants");
	}
}
class omnivores extends Animal{
	void eat() {
		System.out.println("omnivores eat plants and meat");
	}
}
class carnivorse extends Animal{
	void walking() {
		System.out.println("carnivorse");
	}
}

public class RunTime {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		Animal a2=new herbivores();//run time poly Inherritance-upcasting-overriding
		a2.eat();
		Animal a3=new omnivores();//run time poly Inherritance-upcasting-overriding
		a3.eat();
		Animal a4=new carnivorse();//no run time poly because inheritance-upcasting-no overiding
		a4.eat();
		
	}

}
