package Method;

public class Example4 {

	public static void main(String[] args) {
		
		
		
		primeNumber();
		
		

	}
	
	static void primeNumber() {
		int count =0,i,num=7;
		for(i=1;i<=num;i++) 
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is a Prime: "+num);
		}else {
			System.out.println("Given number is not a Prime: "+num);
		}
		}
	}

