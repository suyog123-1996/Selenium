package array;

public class Assignment6 {

	public static void main(String[] args) {
		int arr[]= {20,30,50,60,80};
		System.out.println("printing original number");
		for(int a:arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("priting reverse number");
		int L=arr.length;
		for(int i=L-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
;	}

}
