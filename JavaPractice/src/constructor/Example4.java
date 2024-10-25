package constructor;

public class Example4 {
	int num;
	Example4(int num){
		
	}

	public static void main(String[] args) {
		Example4 ref= new Example4(60);
		System.out.println("NSGV: "+ref.num);
				
		ref.show(30);
		System.out.println("NSGV: "+ref.num);
	}
	void show (int num) {
		
		System.out.println(num);
		this.num=num;
		System.out.println("by using  this keyword "+this.num);
		
	}

}
