package array;
class TestaArray1{
	static void min(int arr[]) {// a[]= {20,30,15,5,1,2};
	int min=arr[0];	//22
	for (int i=1;i<arr.length;i++) {
		if (min>arr[i]) {//22>30 | 22>15 | 15>5|5>1|1>2
			min=arr[i];//		15| 5|1
		}
		
	}
	System.out.println("minimum number is "+min);
	}
	static void max(int arr[] ){
		int max=arr[0] ;//20
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]) {//20<30|30<15|30<5|30<1|30<2
				max=arr[i];//30|30|30|30|30
			}
		}
		System.out.println("maximum number is "+max);
	}
}

public class Array {

	public static void main(String[] args) {
		int a[]= {20,30,15,5,1,2};//intizlization and declaration
		TestaArray1.min(a);//passing array to a method
		TestaArray1.max(a);
	}

}
