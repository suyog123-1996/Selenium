package day3variable;

public class StaticGlobalVariableExample1 {
	static int num1,num2;

	public static void main(String[] args) {
		
		System.out.println("SGV1: "+num1);
		System.out.println("SGV2: "+num2);
		StaticGlobalVariableExample1.num1=20;
		StaticGlobalVariableExample1.num2=100;
		
		int result=num1+num2;
		System.out.println("SGV1: "+StaticGlobalVariableExample1.num1);
		System.out.println("SGV2: "+StaticGlobalVariableExample1.num2);
		System.out.println("Result: "+result);
		
		StaticGlobalVariableExample1.num1=110;
		StaticGlobalVariableExample1.num2=66;
		int result1=num1-num2;
		System.out.println("SGV1: "+StaticGlobalVariableExample1.num1);
		System.out.println("SGV2: "+StaticGlobalVariableExample1.num2);
		System.out.println("Result: "+result1);
		
	}

}
/*Standard Way to acccess the static variable
 * classname.StaticGlobalVariable
 * 
 * 
 */
