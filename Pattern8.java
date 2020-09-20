package learningjava;
import java.util.Scanner;
public class Pattern8 
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
        	for( int j=0;j<=i;j++) {
        	System.out.print(" * ");
        	}
        	System.out.println();
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=1;j<n-i;j++)
        	{
        		System.out.print(" * ");
        	}
        	System.out.println();
        }
        
        
	}

}
