package abstractexaples;
interface demo11{
	int num1=30;
	double num();
	
}
class demo10 implements demo11{
	public double num() {
		return 3.45;
	}
}

public class Interfaceexample {

	public static void main(String[] args) {
		demo10 d1=new demo10();
		System.out.println("num value is "+d1.num());
		System.out.println("num value is "+d1.num1);
		
	}

}
