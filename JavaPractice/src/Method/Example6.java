package Method;

public class Example6 {

	public static void main(String[] args) {
		getReverseNumber(123);
		int res=getReverseNumber(123);
		System.out.println(res);
	}
	static int getReverseNumber(int num) {
		int rev=0,i,rem,temp=num;
		for(;num>0;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;	
		}
		
		return rev;
		
		
		
	}

}
