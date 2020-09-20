package learningjava;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);	
	    System.out.println("enter the value of n");
		int n=obj.nextInt();
		System.out.println(" * ");
		for(int i=2;i<n-i;i++)
		{
			System.out.println(" * ");
			for(int j=1;j<=i-2;j++)
			{
				System.out.println(" ");
			}
			System.out.println(" * ");
			System.out.println();
		}
		
		
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(" * ");
				
		}
		
		
