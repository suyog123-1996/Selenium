package predefinedclasses;

public class WrapperClassExample {

	public static void main(String[] args) {
		int num1=10;
		double num2=55.60;
		boolean status =false;
		char ch='S';
		//Boxing Operation
		//Integer obj1=new Integer(num1);//Its deprecated after java8 and recommended not to use
		Integer Obj1=num1;
		System.out.println("Number1 : "+num1);
		System.out.println("Object1 : "+Obj1);
		System.out.println("num1 and Obj1 comparison :"+(Obj1==num1));
		
		Double Obj2=num2;
		System.out.println("Number2 : "+num2);
		System.out.println("Object2 : "+Obj2);
		System.out.println("num2 and Obj2 comparison :"+(Obj2==num2));
		
		Boolean Obj3=status;
		System.out.println("Status : "+status);
		System.out.println("Object3 : "+Obj3);
		System.out.println("status and Obj3 comparison :"+(Obj3==status));
		
		Character XYZ=ch;
		System.out.println("Character : "+ch);
		System.out.println("Object4 : "+XYZ);
		System.out.println("Character and Obj4 comparison :"+(ch==XYZ));
		
		
		//Unboxing
		int n1=Obj1.intValue();
		double n2=Obj2.doubleValue();
		boolean s1=Obj3.booleanValue();
		char ch1=XYZ.charValue();
		
		System.out.println("Unboxed Num1: "+n1);
		System.out.println("Unboxed Num2: "+n2);
		System.out.println("Unboxed Status: "+s1);
		System.out.println("Unboxed Character: "+ch1);
		
		
		
		
		
		
		
		
	}

}
