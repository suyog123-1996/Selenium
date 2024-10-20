package abstractexaples;
 interface bank{
	float getinterest();
}
 class inbbibank implements bank{
	 public float getinterest() {
		 return 7.80f;
	 }
 }
 class mhbbank implements bank{
	 public float getinterest() {
		 return 8.20f;
	 }
 }

public class Interface1 {

	public static void main(String[] args) {
		mhbbank p1=new mhbbank();
		System.out.println("interest of pnb bank is "+p1.getinterest());
		
	}

}
