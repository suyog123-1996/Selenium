package predefinedclasses;
/*
* Immutable class: to create immutable class, we should have following-
* 	1. class and data variables should be declared as final
* 	2. using constructor parameter above final variables should be initialize
* 	3. create public getter method to access these final variable
* 
* 
*/
final class Testing{
	final String name;
	final double salary;
	Testing(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
}


public class ImmutableClassExample1 {

	public static void main(String[] args) {
		Testing t1=new Testing("bajaj",50000.68);
		System.out.println(t1.getname());
		System.out.println(t1.getsalary());
		
//		t1.name="Pune";//compile time error as these variable are declared as final
//		t1.salary=68962.12;//compile time error as these variable are declared as final
		
		//To modify this value you need to create an object
		
		Testing t2=new Testing("Pune",68962.12);
		System.out.println(t2.getname());
		System.out.println(t2.getsalary());
		
		
		
		
		
		
		
		
		
		
	}

}
