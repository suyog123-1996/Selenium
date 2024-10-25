package constructor;

public class Example6 {
	int i;
	void show(int i){
		
		System.out.println(i);
		this.i=i;
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		
		Example6 ref =new Example6();
		System.out.println(ref.i);
		ref.show(60);
		
		
	}

}
