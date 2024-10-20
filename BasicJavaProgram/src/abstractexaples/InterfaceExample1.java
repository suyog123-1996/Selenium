package abstractexaples;
interface  marbles{
	static int num=202;
	int num2=303;
	void main();
}

public class InterfaceExample1 implements marbles{
	public void main() {
		System.out.println("im main interface");
	}

	public static void main(String[] args) {
		InterfaceExample1 ref=new InterfaceExample1();
		ref.main();
		System.out.println("im num "+ref.num);
		System.out.println("im num2 "+ref.num2);
	}

}
