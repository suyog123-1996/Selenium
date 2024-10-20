package array;

public class Example1 {

	public static void main(String[] args) {
		//Create an array
		int[] age= {2,12,25,5,4};
		//access each array elements
		System.out.println("Accessing Elements of an array");
		System.out.println("First Elemtnt: "+age[0]);
		System.out.println("Second Elemtnt: "+age[1]);
		System.out.println("Third Elemtnt: "+age[2]);
		System.out.println("Fourth Elemtnt: "+age[3]);
		System.out.println("Fifth Elemtnt: "+age[4]);
		System.out.println("array size: "+age.length);
		System.out.println("Using for loop");
		for(int i=0;i<age.length;i++) {
			if(age[i]==25) {
				System.out.println(age[i]+ " is present at index " +i);
				break;
			}
		}
		System.out.println("Using for-each loop");
		for(int a:age) {
			//System.out.println(a); will print the values of age
			if(a==25) {
				System.out.println(a+ " is present at index " +a);
				break;
			}
		}
		
}
}