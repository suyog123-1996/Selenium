package array;

public class Example2 {
	//calculate avg number using array
	public static void main(String[] args) {
		int num[]= {20,30,40};
		double average;
		int sum=0;
		for(int n: num ) {
			//sum=sum+n;
				//or
			sum += n;//---->sum=sum+num;
		}
			System.out.println(sum);
			//System.out.println("length of an array "+num.length);
			//average=sum/num.length;
			int arrayLength=num.length;
			average=sum/arrayLength;
			System.out.println("average value of the number "+average);
	}

}
