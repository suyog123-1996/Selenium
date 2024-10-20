package array;

import java.util.Arrays;

public class Assignment14 {

	public static void main(String[] args) {
		int array[]= {5,6,10,1,8,3,3,5};
		//To print is ascending order will use Arrays.sort
		Arrays.sort(array);
		for(int s:array) {
			System.out.print(s + " ");
		}
		
	}

}
