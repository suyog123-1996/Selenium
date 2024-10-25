package arrays;

public class Example1 {
	
	static void largestNumber(int arr[]) {//{30,40,80,50,50,60}
		int large=arr[0];//30
		for(int i=1;i<arr.length;i++) {
			if (large<arr[i]){
				large=arr[i];
				
			}
		}
		System.out.println(large);
		
	}
	static void smallestNumber(int arr[]) {
		int Small=arr[0];
		
		for(int i=1;i<arr.length;i++) {//{30,40,80,50,50,60}
			if(Small>arr[i]) {
			Small=arr[i];
		}
			
		}
		System.out.println(Small);
		
		
	}
	
	
	public static void main(String[]args) {
		
		
		int[]a= {30,40,80,50,50,60};
		
		Example1.largestNumber(a);
		
		Example1.smallestNumber(a);
		
	}

}
