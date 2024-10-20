package stringClass;

public class StringExample3 {

	public static void main(String[] args) {
		String s1="CoreJavaBasic";
		//substring()
		System.out.println("substring from index 3 "+s1.substring(3));

		System.out.println("Substring from 2 to 5 :"+s1.substring(2,5));//rej//include 2index and exclude 5
		
		System.out.println("String from 4 to 8: "+s1.substring(4,8));//Java
	
		//To add two string
		String s2="Core";
		String s3="JavaBasic";
		System.out.println("First value of s2 "+s2);
		System.out.println("First value of s3 "+s3);
		System.out.println("Concated String :"+s2.concat(s3));
		System.out.println("After Concated value of s2 "+s2);
		System.out.println("Afetr Concated value of s3 "+s3);
	
		String s5="Learn Share Learn Share";
		
		System.out.println("s5 size "+s5.length());
		//Index of goes to left to right
		System.out.println("Index of Share starts from: "+s5.indexOf("Share"));
	
		System.out.println("Index of a: "+s5.indexOf('a', 3));
		
		//"Learn Share Learn Share"
		//to find last index
		//LastIndexOf goes to right to left
		System.out.println("last index Learn: "+s5.lastIndexOf("Learn", 8));
	
		System.out.println("last index e: "+s5.lastIndexOf('e', 11));
	
		//Checking equality of string
		String s6="Selenium";
		String s7="selenium";
		String s8="Selenium";
		
		System.out.println("Checking equality of s6 & s7: "+s6.equals(s7));
		System.out.println("Checking equality of s6 & s8: "+s6.equals(s8));
		//if strings are same but different with the case
		//to Ignore case use this method
		System.out.println("Checking equality of s6 & s7 with Ignore case: "+s6.equalsIgnoreCase(s7));
		
		//Converting Cases
		//to convert all string into the lower case
		String word1="CoreJava";
		System.out.println("Converting to lower case: "+word1.toLowerCase());//corejava
		
		//Converting Cases
		//to convert  all string into the Upper case
		
		String word2="CoreJava";
		System.out.println("Converting to Upper case: "+word2.toUpperCase());//COREJAVA
		
		String word3="   I am Suyog   ";
		System.out.println("Actual String: "+word3);
		System.out.println("Actual String Length: "+word3.length());
		System.out.println("Actual String after trim: "+word3.trim());
		System.out.println("Actual String length after trim: "+word3.trim().length());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
