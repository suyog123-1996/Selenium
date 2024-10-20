package array;

public class M_Array {

	public static void main(String[] args) {
		//declaration and intialization  of 2D array
		int [][]arr=new int[3][3];
		System.out.println("Total row in arrow: "+arr.length);
		System.out.println("Total column in a row: "+arr[0].length);
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
		System.out.println("*****************");
		//to store data in array
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
