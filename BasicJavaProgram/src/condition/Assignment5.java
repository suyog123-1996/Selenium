package condition;

public class Assignment5 {
		//Count number of an integer 
	public static void main(String[] args) {
		int count = 0, num = 23456;

	    for (; num != 0; num /= 10) {
	    	 ++count;
	    }

	    System.out.println("Number of digits: " + count);
	}

}
