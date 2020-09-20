package learningjava;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of n");
			int n=obj.nextInt();
			int j=0;
			for(int i=0;i<n;i++)
			{
				for(j=0;j<n-i;j++) 
				{
					System.out.print("   ");
				}
				for(j=0;j<i;j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			
	}

}
