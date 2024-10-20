package constructor;

public class Example3 {
		int age=20,empid;
	public static void main(String[] args) {
		Example3 ref=new Example3();
		int empid=120;
		System.out.println("NSGV "+ref.empid);
		System.out.println(ref.age);
		System.out.println(ref.empid);

	}
	Example3(){
		System.out.println("****************");
		empid=202;
		
		this.empid=empid;
	}

	
	
	
	void employee()
	{
		
	}

}
