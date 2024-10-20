package aceccmodifire2;

import accessmodifier1.demo1;

public class Example1 extends demo1 {//for pretotect modifier we inherited a demo1 from other package that we import

	public static void main(String[] args) {
		Example1 d1=new Example1();//as rule of inheritance all parent class object are comes under it child classs
		//we created a object of child class ans we are able to access the protected
		//System.out.println("access default num from demo1 : "+d1.num1); //not accessible ouside the package
		//System.out.println("access private num from demo1 : "+d1.num2);//not accessible outside the the class
		System.out.println("access protected num from demo1 : "+d1.num3);//to access it need to inherite
		System.out.println("access public num from demo1 : "+d1.num4);

}

}
