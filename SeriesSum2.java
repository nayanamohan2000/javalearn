package learningjava;
import java.util.Scanner;
public class SeriesSum2 {

	public static void main(String[] args) {
		// 1-1/2+1/3-1/4......1/n
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=obj.nextInt();
		float sum=0;
		for(float i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum= sum-1/i;
			}
			else {
				sum=sum+1/i;
			}
			
			
		}
				
		System.out.println("sum of the series is "+ sum);
		
	}

}
