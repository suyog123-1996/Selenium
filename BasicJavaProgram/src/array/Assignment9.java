package array;
class LargestNumber{
	static void LargestNumber(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			
		}
		System.out.println("largest number is: "+max);
	}
}

public class Assignment9 {

	public static void main(String[] args) {
		int array[]= {30,50,20,60,80};
		LargestNumber.LargestNumber(array);
	}

}
