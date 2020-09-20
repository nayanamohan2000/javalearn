package learningjava;
import java.util.Scanner;
public class Break {
	public static void main(String[] args)
	{
//		for(int i=0;i<100;i++)
//		{
//		  if(i==35)
//		  {
//			  break; break exists the current loop and executes the instruction next to the loop
//			  
//		  }
//		  System.out.println(i);
//		System.out.println("enter the value");

	Scanner obj=new Scanner(System.in);
	for(;;)
	{
		int n=obj.nextInt();
		if(n<0)
			break;
	}
	System.out.println("fool");
	}

}
