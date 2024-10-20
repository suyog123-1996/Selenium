package array;

public class Assignment2 {

	public static void main(String[] args) {
		//to find frequency of an array
		int arr[]= {20,30,50,30,20,30,50,60};
		int freq[]=new int[arr.length];
		System.out.println(arr.length);
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;//1
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count++;
					freq[j]=visited;
				}
				if(freq[i]!=visited) {
					freq[i]=count;
				}
			}
			
		}
		for (int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println("Element | Frequency");
				System.out.println(arr[i] +" | " +freq[i] );
			}
		}

	}

}
