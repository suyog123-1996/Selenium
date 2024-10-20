package method;

public class Assignment4 {

	public static void main(String[] args) {
		Assignment4 res=new Assignment4();
		//Assignment4.factornumber(8);
		res.factorNumber(10);
	}
	public int factorNumber(int num) {
		
		
			for(int i=1;i<=num;i++) {
				if (num%i==0) {
					System.out.println(i);
				}
			}
			return num;
			
		
	}

}
