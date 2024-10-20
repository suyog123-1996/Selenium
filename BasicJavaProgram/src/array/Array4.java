package array;
class sample{
	int age;
	double salary;
	sample(){
		
		System.out.println("i am zero param constructor");
	}
	sample(int a){
		age=a;
		System.out.println("i am int param constructor "+age);
	}
	sample(double a){
		salary=a;
		System.out.println("i am double param constructor "+salary);
	}
	void calling () {
		System.out.println("calling of sample class age: "+age);
		System.out.println("calling of sample class salary: "+salary);
	}
}

public class Array4 {

	public static void main(String[] args) {
		sample S1=new sample();
		sample S2=new sample(20);
		sample S3=new sample(25000.25);
		S1.calling();
		S2.calling();
		S3.calling();
		System.out.println("**********************");
//		Sample[] e=new Sample[] {new Sample(),new Sample(15),new Sample(25.36)};
//		//or
//	    Sample[] e={new Sample(),new Sample(15),new Sample(25.36)};
		//or
		sample[] e=new sample[3];
		e[0]=new sample();
		e[1]=new sample(22);
		e[2]=new sample(33505.6);
		e[0].calling();
		e[1].calling();
		e[2].calling();
	
	}

}
