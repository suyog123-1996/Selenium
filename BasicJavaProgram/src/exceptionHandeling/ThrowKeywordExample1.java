package exceptionHandeling;

public class ThrowKeywordExample1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//validateAge(18);
		validateAge(17);
		System.out.println("Program Starts");
	}
	static void validateAge(int age) {
		if (age>=18) {
			System.out.println("Welcomwe to fb you can create your profile");
		}else {
			throw new ArithmeticException("Sorry you are below 18, you are not able to create your profile");
		}
	}

}
