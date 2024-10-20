package abstractexaples;
interface Animal12{
	int age=6;
	void animalSound();	//interface method (does not have body)
}
interface Reptile{
	public void colour();//interface method (does not have body)
}
class pig implements Animal12{
	public void animalSound() {
		System.out.println("im pig "+ "wee wee");
	}
}
class dog12 extends pig implements Reptile{
	public void colour() {
		System.out.println("im dog : my coulur is brown");
		}
		public void animalSound() {
			System.out.println("The dog says: bow bow");
		}
}
public class Interface {

	public static void main(String[] args) {
		dog12 d1=new dog12();
		d1.animalSound();
		d1.colour();
		System.out.println("My Age is : "+d1.age);
		pig p1=new pig();
		p1.animalSound();
		System.out.println("my age is "+p1.age);
	}

}
