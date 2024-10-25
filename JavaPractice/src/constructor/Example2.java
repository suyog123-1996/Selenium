package constructor;

public class Example2 {
	int num;
	Example2(int num){
		System.out.println("i am zero param constructor");
		System.out.println(num);
		this.num=num;
		System.out.println(this.num);
	}

	public static void main(String[] args) {
		Example2 ref= new Example2(60);
		System.out.println("NSGV: "+ref.num);
		ref.show(30);
		System.out.println("NSGV: "+ref.num);
	}
	void show (int num) {
		
		System.out.println(num);
		this.num=num;
		
	}

}
