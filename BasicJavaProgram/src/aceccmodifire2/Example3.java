package aceccmodifire2;

public class Example3 {

	public static void main(String[] args) {
		accessmodifier1.demo1 d1= new accessmodifier1.demo1();
		//System.out.println("access default num from demo1 : "+d1.num1);
		//System.out.println("access private num from demo1 : "+d1.num2);
		//System.out.println("access protected num from demo1 : "+d1.num3);
		System.out.println("access public num from demo1 : "+d1.num4);
	
	

}
/*	we can also public member outside the package by using fully qualified name
 	packagename.classname
 	if you r using fully qualified class name then for each object creation you 
 	need to use fully qualified class name.
 */





}