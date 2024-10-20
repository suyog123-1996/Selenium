package predefinedclasses;
class seleniumTesting{
	String name="Pune";
	//create private constructor
	private seleniumTesting() {
		System.out.println("I am selenium class cons");
	}
	private static seleniumTesting ref=new seleniumTesting();//private static object
	
	//create a method
	
	public static seleniumTesting getInstance() {
		return ref;
	}
	
	
}

public class SingletonClassExample1 {

	public static void main(String[] args) {
//		seleniumTesting s1=new seleniuTesting(); Compile time error as it's constrructor is private
		
		seleniumTesting s1= seleniumTesting.getInstance();
		System.out.println("Name with reference s1: "+s1.name);
		
		s1.name="Banaglore";
		System.out.println("Upadated name with reference s1: "+s1.name);
		
		seleniumTesting s2= seleniumTesting.getInstance();
	
		System.out.println("Name with reference s2: "+s2.name);
	
	}

}
