package abstractexaples;
//abstract class
abstract class Animal{
		abstract void animalSound();//abstract mathod does not contain a body
		 void display() {
			 System.out.println("hi im parent display method");
		 }
}
class dog extends Animal{
		public void animalSound() {
			System.out.println("i am dog: "+ " bow  bow");
		}
	}
class cat extends Animal{
	protected void animalSound() {
		System.out.println("i am cat: "+ " meow  meow");
	}
}

public abstract class Exapmle2 {

	public static void main(String[] args) {
		dog d1=new dog();
		d1.animalSound();
		d1.display();
		cat c1=new cat();
		c1.animalSound();
		c1.display();
		//Animal a1=new Animal(); cannot instantiate abstract method
		Animal a1=d1;
		a1.animalSound();
	}

}
