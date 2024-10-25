package Method;

public class Example5 {

	public static void main(String[] args) {
		
		
		
		primeNumber(7);
		
		

	}
	
	static int primeNumber(int num) {
		int count =0,i;
		for(i=1;i<num;i++) 
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
			return num;	
			
		}
	}

