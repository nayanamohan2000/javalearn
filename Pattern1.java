package learningjava;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("enter the value of m and n");
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt();
		int n=obj.nextInt();
		for(int j=1;j<=m;j++) {
		for(int i=1;i<=n;i++)
		{
			System.out.print(" * ");
		}
		System.out.println();
		
	}
	
}
}
