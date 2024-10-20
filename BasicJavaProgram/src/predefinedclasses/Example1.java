package predefinedclasses;
class Sample{//by default inheritate the object class
	void show() {
		System.out.println("i am show method");
	}
}

public class Example1 extends Sample{

	public static void main(String[] args) {
		Example1 ref =new Example1();
		System.out.println("Example ref "+ref.toString());//it gives the fully qualified classname @hexademinal number
		Example1 ref2=new Example1();
		System.out.println("Example ref "+ref2);//by implicitly toString will called by jvm
		
		System.err.println("for integer value of hexadecima we use hashcode()method");
		System.out.println("for integer value of ref "+ref.hashCode());
		System.out.println("for integer value of ref2 "+ref2.hashCode());
		System.out.println("to compare given object to this object we use equals(object obj)");
		System.out.println("compairing ref and ref2 based on the address "+ref.equals(ref2));
		
		Sample S1=ref;//object has been of Example class and refrence of Sample class
		System.out.println("Example S1 "+S1.toString());
		
		System.out.println("for integer value of S1 "+S1.hashCode());
		
		System.out.println("compairing ref and S1 based on the address "+ref.equals(S1));
	}
	void display() {
		System.out.println("hi iam display method");
	}
}
