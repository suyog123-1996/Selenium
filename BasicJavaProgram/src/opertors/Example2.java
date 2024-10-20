package opertors;

public class Example2 {

	public static void main(String[] args) {
		int x=25,y=30;
		boolean cond1=x==y;
		boolean cond2=x<y;
		boolean result=(cond1 && cond2);
		boolean result1=(cond1 ||cond2);
		System.out.println("Final Result: "+result);
		System.out.println("Final Result1: "+result1);
							//or
		System.out.println("Final Result: "+(cond1 && cond2));
		System.out.println("Final Result1: "+(cond1 || cond2));
	}

}
/*
 For And Operator
 	true: if both condition is true;
 	false: if any one if condtion is false then false
 	
 For OR Operator
 	true: if any one if condtion is true then true;
 	false: if both  condtion is false then false
 */
