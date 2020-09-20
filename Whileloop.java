package learningjava;
import java.util.Scanner;
public class Whileloop { // sum of digits in a given number 
	public static void main(String[] args)

	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of number");
		int num=obj.nextInt();
	    int temp=num;
	    int sum=0;
	    while(temp>0)
	    {
	    	int lastdigit=temp%10;
	    	 temp=temp/10;
	    	sum=sum+lastdigit;
	    }
	    System.out.println("sum of the digits of numbrer is" +sum);
	    	
	    }
		 
	}



