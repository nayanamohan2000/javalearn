package learningjava;
import java.util.Scanner;
public class Array {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String name[]=new String[100];	
          for(int i=0;i<5;i++)
          {
        	  name[i]=obj.nextLine();
          }
          for(int i=0;i<5;i++)
          {
        	 System.out.println(name[i]);
          }
      
      
}
}
