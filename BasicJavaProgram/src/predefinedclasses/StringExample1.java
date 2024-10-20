package predefinedclasses;

public class StringExample1 {

	public static void main(String[] args) {
		String s1="Pune";//one object will be created in string constant pool
		String s2="Pune";//no object will created as pune is already available in pool
		String s3="Mumbai";//one object will be created
		
		System.out.println("String S1: "+s1+" char value is  "+s1.length());
		System.out.println("String S1: "+s2+" char value is  "+s2.length());
		System.out.println("String S1: "+s3+" char value is  "+s3.length());
		
		System.out.println("Compaoring s1 and s2 based on value using equals()"+s1.equals(s2));
		System.out.println("Compaoring s1 and s3 based on value using equals()"+s1.equals(s3));
		
		System.out.println("Compaoring s1 and s2 based on address using '=='"+(s1==s2));
		System.out.println("Compaoring s1 and s2 based on adress using '=='"+(s1==s3));
		
		String s4=new String("Bangalore");//two object will be created 1. nonConstantPool  2.Constant pool
		String s5=new String ("Bangalore");//one object will created 1. nonConstantPool
		String s6= new String("Pune");//one object will created
		
		System.out.println("Compaoring s4 and s5 based on value using equals()"+s4.equals(s5));
		System.out.println("Compaoring s4 and s6 based on value using equals()"+s4.equals(s6));
		
		System.out.println("Compaoring s4 and s5 based on address using '=='"+(s4==s5));
		System.out.println("Compaoring s4 and s6 based on address using '=='"+(s4==s6));
		
		System.out.println("Compaoring s1 and s6 based on value using equals()"+s1.equals(s6));
		System.out.println("Compaoring s1 and s5 based on address using '=='"+(s1==s5));
		
		
	}

}
