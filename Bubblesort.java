package learningjava;
import java.util.Scanner;
public class Bubblesort {
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			int a[]=new int[10];
			System.out.println("enter the elements needed to be sorted");
			for(int i=0;i<a.length;i++)
			{
				a[i]=obj.nextInt();
				
			}
			System.out.println("elements entered");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
				
			}
			System.out.println();
			
			for(int i=0;i<a.length-1;i++)
			{
				boolean sorted=true;
				for(int j=0;j<a.length-1-i;j++)
				{
					if(a[j+1]<a[j])
					{
						int temp;
						temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;	
		                sorted=false;
					}
				}
				if(sorted)
				{
					break;
				}
			}
			System.out.println("sorted elements");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
				
			}
			
			
		}
		
	}

