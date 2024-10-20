package abstractexaples;
interface sample{
	int num=55;
	public void main();
}
interface sample1{
	public void method();
}
public class Interface2 implements sample,sample1 {
	public void main() {
		System.out.println("hello this is hcl sample");
	}
	public void method() {
		System.out.println("Hello this is magnesium sample");
	}
	int num=25;
	public static void main(String[] args) {
		Interface2 I1=new Interface2();
		I1.main();
		I1.method();
		System.out.println("num= "+sample.num);
	}

}
