package methods;

public class Example6 {
	public static void main(String[]args) {
		
		Example6.primeNumber(4);
		
	}
	static void primeNumber(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("Given Number is Prime "+num);
		}
		else {
			System.out.println("Given Number is not Prime "+num);
		}
		
	}

}
