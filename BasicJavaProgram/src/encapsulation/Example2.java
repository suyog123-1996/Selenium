package encapsulation;

public class Example2 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		//System.out.println(ref.empId);
		//System.out.println(ref.salary);
		
		System.out.println(ref.getEmpId());
		System.out.println(ref.getSalary());
		System.out.println("updated salary");
		ref.setEmpId(202);
		ref.setSalary(5000.05);
		System.out.println(ref.getEmpId());
		System.out.println(ref.getSalary());
		
	}
	
}

