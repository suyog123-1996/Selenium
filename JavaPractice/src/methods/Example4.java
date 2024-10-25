package methods;

public class Example4 {
	public static void main(String[]args) {
		
		Example4.largestNumber();
		
	}
	static void largestNumber() {
		int x=200,y=160,z=105;
		if(x>y && x>z) {
			System.out.println("Largest Number is is x: "+x);
		}
		else if (y>x && y>z){
			System.out.println("Largest Number is is y: "+y);
		}
		else
		{
			System.out.println("Largest Number is is z: "+z);
		}
	}

}
