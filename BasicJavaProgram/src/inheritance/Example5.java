package inheritance;
class car{
	void mycar(){
		System.out.println("this is my car");
	}
	
}
class SUV extends car{
	void mysuv(){
		System.out.println("this is my suv");
	}
	
}
class Mahindra extends SUV{
	void mymahindra(){
		System.out.println("this is my car");
	}
	
}

public class Example5 {

	public static void main(String[] args) {
		System.out.println("***************");
		Mahindra ref=new Mahindra();
		ref.mymahindra();
		ref.mysuv();
		ref.mycar();
		System.out.println("***************");
		SUV ref1=ref;//parent class is taking all his property from child
		ref1.mysuv();
		ref1.mycar();
		//ref1.mahindra();parent class cannot access child property
		System.out.println("*******************");
		car ref2=ref1;
		ref2.mycar();
		
	}

}
