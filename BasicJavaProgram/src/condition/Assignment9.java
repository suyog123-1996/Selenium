package condition;

public class Assignment9 {
//				To check prime number
	public static void main(String[] args) {
		int num=7,count=0,i;
		for(i=1;i<=num;i++)
		{
			if (num%i==0){// 9%1=0||9%2=1||9%3=0||9%4=1||9%5=4||9%6=3
						  //9%8=1||9%9=0
			//3%1=0||3%2=1
			count++; //0 count is 3 times
			}
		}
	if(count==2) {
		System.out.println("Given number is a Prime Number: "+num);
	}
	else {
		System.out.println("Given number is not a Prime Number: "+num);

	}
	}
	

}
