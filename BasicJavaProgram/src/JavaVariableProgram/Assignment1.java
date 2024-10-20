package JavaVariableProgram;

public class Assignment1 {

	public static void main(String[] args) {
	/*	double p=10000,a ;
		float r=6,t=5;
		a=(p*r*t)/100;
		System.out.println("Principle Balance: "+ p);
		System.out.println("Annual Rate interest: "+r);
		System.out.println("Time: " + t);
		System.out.println("Interest Amount: "+ a);*/
		double p=60000,a;
		float r=5,t=3;
		a=(p*r*t)/100;
		double T=a+p;
		System.out.println("Principle Balance: "+ p);
		System.out.println("Annual Rate interest: "+r);
		System.out.println("Time: " + t);
		System.out.println("Interest Amount: "+ a);
		System.out.println("Total "+T);	
	}

}
