package array;

import java.util.Arrays;

public class M_Array3 {
		//java program to copy the array
	public static void main(String[] args) {
		char[] copyFrom= {'a','b','c','d','e','f','g','h','i'};
		System.out.println("count of the copyFrom: "+copyFrom.length);
		char[] copyTo= Arrays.copyOf(copyFrom, 5);
		System.out.println("count of the copyTo: "+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]);
		}
		System.out.println();
		System.out.println(" **********copy using Range********");
		char copyWithRange[]=Arrays.copyOfRange(copyFrom, 2, 7);
		System.out.println("count of the copyWithRange: "+copyWithRange.length);
		for(int i=0;i<copyWithRange.length;i++) {
			System.out.print(copyWithRange[i]);
		}
		System.out.println();
		System.out.println("using for for each loop");
		for(char c:copyWithRange) {
			System.out.print(c);
		}
		System.out.println("**********After Sorting**********");
		Arrays.sort(copyWithRange);//it will give you in ascending order
		for(char c:copyWithRange) {
			System.out.print(c + " ");
		
		}
	
	}

}
