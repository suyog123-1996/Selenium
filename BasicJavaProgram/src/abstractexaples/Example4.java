package abstractexaples;
abstract class Rbibank{
	abstract double getInterestCarLoan();
	final void openPfAccount() {
		System.out.println("opening pf account");
	}
}
class sbiBank extends Rbibank{
	double getInterestCarLoan() {
		return 8.5;
	}
	/*void openPfAccount() { cannot override bacause we declare this method 
							with final keyword
	}*/
}
class pnbBank extends Rbibank {
	double getInterestCarLoan(){
		return 6.5;
	}
}

public class Example4 {

	public static void main(String[] args) {
		pnbBank p1= new pnbBank();
		p1.getInterestCarLoan();
		System.out.println("pnb getInterestLoan "+p1.getInterestCarLoan() +"%");
		p1.openPfAccount();
		sbiBank s1=new sbiBank();
		System.out.println("sbi getInterestLoan"+s1.getInterestCarLoan() +"%");
		s1.openPfAccount();
	}

}
