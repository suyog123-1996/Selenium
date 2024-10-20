package encapsulation;

public class Example1 {
	private int empId=101;
	private double salary=4500;

	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println(ref.empId);
		System.out.println(ref.salary);
	}
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}

}
