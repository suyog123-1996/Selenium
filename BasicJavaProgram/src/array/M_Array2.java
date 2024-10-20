package array;

public class M_Array2 {

	public static void main(String[] args) {
		int a[][]={ {1,2,3},{2,4},{6,8,4,9}};//each entry in a row
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		char charArr[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		for(int i=0;i<charArr.length;i++) {
			for(int j=0;j<charArr[i].length;j++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
