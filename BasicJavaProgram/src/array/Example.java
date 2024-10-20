package array;

public class Example {

	public static void main(String[] args) {
		/**
		 //Declaration
		  int a[]
		  //size initialization
		   a=new int[5];
		 */     
			//or
		int a[]=new int[5];//declaration and initialization
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		a[0]=20;//initialization
		a[1]=30;
		a[2]=40;
		a[3]=50;
		a[4]=60;
		System.out.println("**After initilization********");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("Array element count "+a.length);
		System.out.println("Normal for loop");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("using for-each loop");
		/**
		 * LHS should be same as RHS(array) type in form of datatype or class
		 * for(LHS : RHS){
		 * 
		 * }
		 */
		for (int num: a) {
			System.out.println(num);
		}
		char[] getarray=new char[] {'A','B','C','D'};
					//or
		char[]getarray1=new char[4];
		getarray1[0]='A';
		getarray1[1]='B';
		getarray1[2]='C';
		getarray1[3]='D';
		
			//or
		char[] getarray2= {'A','B','C','D'};
			System.out.println("using for each loop");	
	for(char num :getarray) {
		System.out.println(num);
	}
	}

}