package condition;
					//Progra to find ASCII  value of integer
public class Asciii{
	public static void main(String args [])
	{
		int i; //for every char there is integer value is assign
			// therefore we are taking an integer "i' 
		char ch='a';
		for(ch='a';ch<='z';ch++)
		{
			i=ch;// i value should be store in character
			//so, 65=A;66=B;67=C;
			System.out.println(ch+ " ASCII "  + i);
		}
				
	}
}

/*public class Asciii {

	public static void main(String[] args) {
		char ch='a';
		for (;ch<='z';ch++)
		{
			//System.out.println("Ascii value of " +ch + "is :" +(byte) (ch) );
			System.out.println("ASCII Value of " + ch + " is : " +  (ch+0));

			//System.out.println("ASCII Value of " + ch + " is : " + (byte) (ch));
		}

	}

}*/
//Java Program to print the ASCII values 
/*public class Asciii
{
   //Driver code
   public static void main(String []args)
   {
      for(char ch='A';ch<='Z';ch++)
      {
          System.out.println("The ASCII value of "+ch+" is "+(int)ch);
      }
   }
}*/










