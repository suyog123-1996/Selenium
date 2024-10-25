package Method;

public class Example {

	public static void main(String[] args) {
		
		Example.getReverseNumber();//Best practise says accces standard way
	//classname.method you want to access in static method 
		//note see next programs for this also
		getReverseNumber();
	}
	static void getReverseNumber() {
		int num=123,rem,rev=0;
		for(;num>0;num=num/10) {
			
		
		rem=num%10;
		rev=rev*10+rem;
		}
		System.out.println(rev);
	}
				
}
