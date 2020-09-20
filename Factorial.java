package learningjava;
import java.util.Scanner;
public class Factorial {
      public static void main(String[] args) {
    	  System.out.println("enter the n");
    	  Scanner obj=new Scanner(System.in);
    	  int n=obj.nextInt();
    	  int factorial=1;
    	  for(int i=n;i>0;i--) {
    		 factorial=factorial*i;
    	  }
    	  System.out.println(factorial);
      }
}
