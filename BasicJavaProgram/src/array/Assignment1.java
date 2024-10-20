package array;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		//copy of one array to another array
		int copyFrom[]= {2,3,8,6,9};
		System.out.println("coping and array");
		int copyOf[]=Arrays.copyOf(copyFrom,5);
		System.out.println("Printing array using for-each loop");
		for(int c:copyOf) {
			System.out.print(c +  " ");
		}
	}

}
