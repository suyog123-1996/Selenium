package predefinedclasses;
class Sample2{
	void show() {
		System.out.println("iam Sample2 class show method");
	}
}

public class Example2 extends Sample2{

	public static void main(String[] args) {
		Example2 ref1=new Example2();
		System.out.println("ref1 toString() "+ref1.toString());
		System.out.println("ref1 hashcode() "+ref1.hashcode());
		Example2 ref2= new Example2();
		System.out.println("ref2 toString() "+ref2.toString());
		System.out.println("ref2 hashcode() "+ref2.hashcode());
		//gives you a true ans beacsuse this class contain overided tostring and hashcode methdo
		System.out.println("compare both object with the adress "+ref1.equals(ref2));
		Sample2 S1=new Sample2();
		System.out.println("S1 toString() "+S1.toString());
		System.out.println("S1 hashcode() "+S1.hashCode());
		Sample2 S2=new Sample2();
		System.out.println("S2 toString() "+S2.toString());
		System.out.println("S2 hashcode() "+S2.hashCode());
		//gives you a false ans beacsuse this class not contain overided tostring and hashcode methdo
		System.out.println("compare both object with the adress "+S1.equals(S2));
		
		
		
		
	}
	void display () {
		System.out.println("iam display method");
	}
	@Override 
	public String toString() {
		return "Hello";
	}
	 
	public int hashcode(){
		return 210;
	}
	public boolean equals(Object obj) {
		return true;
	}

}
