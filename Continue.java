package learningjava;
import java.util.Scanner;
public class Continue {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<100;i++)
		{
			int n=obj.nextInt();
			
			if(n>=40&&n<=50)
	     		continue;
			System.out.println(n);
		}
		
	}

}
