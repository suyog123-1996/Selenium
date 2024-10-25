package constructor;

public class Example3 {
	int num;
	Example3(int num){
		System.out.println(num);
		num=num;
		this.num=num;
		System.out.println("by using this keyword "+this.num);
	}

	public static void main(String[] args) {
		Example3 ref= new Example3(60);
		System.out.println("NSGV: "+ref.num);
				
		ref.show(30);
		System.out.println("NSGV: "+ref.num);
	}
	void show (int num) {
		
		System.out.println(num);
		this.num=num;
		
	}

}
