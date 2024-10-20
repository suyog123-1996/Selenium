package polymorphism;
class bank{
	float getinterest() {
		return 0;
	}
}
class SBI extends bank {
	float getinterest() {
		return 7.5f;
	}
}
class PNB extends bank{
	float getinterest() {
		return 6.6f;
	}
}

public class Runtime3 {

	public static void main(String[] args) {
		bank b1=new PNB();
		System.out.println(b1.getinterest());
		bank b2=new SBI();
		System.out.println(b2.getinterest());
	}

}
