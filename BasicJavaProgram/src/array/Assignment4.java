package array;

import java.util.Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		///duplicate element of an array
		int array[]= {2,3,4,5,6,8};
		System.out.println("Printing original array");
		for(int a:array) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Printing duplicate array");
		int duplicate[]=array.clone();
		for(int dupli:duplicate) {
			System.out.print(dupli + " ");
		}
		System.out.println();
		System.out.println("compairing array and duplicate array : "+Arrays.equals(array,duplicate));
	}

}
