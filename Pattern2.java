package learningjava;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of m");
		int m=obj.nextInt();
		int i,j;
		for(i=1;i<=m;i++)
		{
		    for(j=1;j<=i;j++)
		    {
			System.out.print(" * ");
		}
		    System.out.println();
	}

}
}
