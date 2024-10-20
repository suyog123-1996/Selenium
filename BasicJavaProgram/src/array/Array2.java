package array;
class ReturnArray{
	//creating method to return an array
	static int[] getArray() {
//		int num=new int[3];
//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
//		return num;
		return new int[] {20,30,50,55,10};
	}
}

public class Array2 {

	public static void main(String[] args) {
		int arr[]=ReturnArray.getArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
