package opertors;

public class OPT {

	public static void main(String[] args) {
		int a=0,b;
		b= a++ + ++a + ++a +a;
		System.out.println(a);
		System.out.println(b);
		//i 0 2 3 3 =8 (add all of these) b
		//f 1 2 3 3 =3 (last one will be "a" value) a
		System.out.println("***************");
		a=0;
		b= a-- + --a + --a + a;
		//i 0 -2 -3 -3 =-8 (add all of these) b
		//f -1 -2 -3 -3 =-3 (last one will be "a" value) a
		System.out.println(a);
		System.out.println(b);
		System.out.println("***************");
		a=0;
		b= --a + --a + --a + a + ++a + a++;
		//i -1 -2 -3 -3 -2 -2 =-13 (add all of these) b
		//f -1 -2 -3 -3 -2 -1 =-1 (last one will be "a" value) a
		System.out.println(a);
		System.out.println(b);
		System.out.println("***************");
		a=0;
		b= a-- + a + ++a + a++ + ++a + a++ +a;
		//i  0 -1 0 0 2 2 3 =6 (add all of these) b
		//f -1 -1 0 1 2 3 3 =3 (last one will be "a" value) a
		System.out.println(a);
		System.out.println(b);
		System.out.println("***************");



	}

}
