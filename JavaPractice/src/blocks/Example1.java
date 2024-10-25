package blocks;

public class Example1 {
	Example1(int num1,int num2){
		int res=num1+num2;
		System.out.println(res);
	}

	public static void main(String[] args) {
		Example1 ref=new Example1(20,30);
		
	}
	static {
		System.out.println("Hello i am static block");
	}
	
	{
		System.out.println("Hello i am  non static block");
	}
}
/* Blocks-
 * it is used to give information
 * 	Block will be first executed in the program
 * as know static block will executed  first
 * for non static block once refrence is created before constructor non static block willl be executed
 * we can have multiple  blocks in the program
 * 
 * 
 */
