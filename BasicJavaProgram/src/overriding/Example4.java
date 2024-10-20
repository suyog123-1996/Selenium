package overriding;
class D1{
	int num=202;
	private void m1() {
		System.out.println("im private");
	}
	protected void m2() {
		System.out.println("im protected");
	}
}
class D2 extends D1{
	int num=303;
	private void m1() {
		System.out.println("im private1");
	}
	
	protected void m2() {
		System.out.println("im protected1");
		super.m2();
		System.out.println("num from parent class= "+super.num);
	}
}

public class Example4 {

	public static void main(String[] args) {
		D2 ref=new D2();
		ref.m2();
		//ref.m1(); cannot access because of private if visibility less
		D1 ref1=new D2();
		ref1.m2();
		
		
	}

}
