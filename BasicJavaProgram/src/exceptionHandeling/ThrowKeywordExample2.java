package exceptionHandeling;

class SuyogException extends Exception{
	SuyogException (String exp){
		super(exp);
	}
}

public class ThrowKeywordExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//validateAge(18);
		//validateAge(17);
		System.out.println("Program Starts");
	}
	
	
	static void printings() {
		
	}
	
	
	
	
	
	
	static void validateAge(int age) throws SuyogException {
		if (age>=18) {
			System.out.println("Welcomwe to fb you can create your profile");
		}else {
			throw new ArithmeticException("Sorry you are below 18, you are not able to create your profile");
		}
	}

}
