package constructor;

public class Example2 {
				//this Keyword
	int num=20;
	Example2(){
		System.out.println("***********");
	}
	public static void main(String[] args) {
		
		Example2 ref=new Example2();
		System.out.println("NSGV "+ref .num);
		ref.display();
		
		
	}
	void display()
	{
		int num=5;
		System.out.println(num);
		System.out.println("*******************");
		this.num=num;//by writing this keyword you 
		//dont need to create a object,u r giving local value to global
		System.out.println(this.num);
		//System.out.println("this keyword value from display " +this.num);
	}

}
