package accessmodifier1;

public class demo1 {int num1=202;
		private int num2=203;
		protected int num3=404;
		public int num4=505;
		public static void main(String[] args) {
		demo1 d1= new demo1();
		System.out.println("access default num from demo1 : "+d1.num1);
		System.out.println("access private num from demo1 : "+d1.num2);
		System.out.println("access protected num from demo1 : "+d1.num3);
		System.out.println("access public num from demo1 : "+d1.num4);
}

}

 class Exmple1 {

			public static void main(String[] args) {
				demo1 d1=new demo1();
			System.out.println("access default num from demo1 : "+d1.num1);
			//System.out.println("access private num from demo1 : "+d1.num2);private modiers is only allows to access within the class
			System.out.println("access protected num from demo1 : "+d1.num3);
			System.out.println("access public num from demo1 : "+d1.num4);
	
}

			
}
