package learningjava;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		//prime number is a +ve integer that has exact two divisors...
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=obj.nextInt();
		boolean isprime =true;
		if(n<2) {
			isprime=false;
		}
		for(int i=2;i*i<n;i++)      //for(int i=2;i<n;i++) which is not preferable   time complexity!!!
		{
			if(n%i==0) {
				isprime=false;
				break;
			}
			
		}
		System.out.println("isprime is "+ isprime);
		
	}

}

