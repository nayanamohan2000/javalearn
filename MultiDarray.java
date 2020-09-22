package learningjava;
import java.util.Scanner;
public class MultiDarray {
      public static void main(String[] args)
      {
    	  Scanner obj=new Scanner(System.in);
    	  
    	  System.out.println("enter number of rows");
    	  int row=obj.nextInt();
    	  System.out.println("enter number of col");
    	  int col=obj.nextInt();
    	  int a[][] =new int[10][10];
    	  int b[][]=new int[10][10];
    	  int c[][]=new int[10][10];
    	  System.out.println("enter matrix one");
    	  for(int i=0;i<row;i++)
    	  {
    		  for(int j=0;j<col;j++)
    		  {
    			  a[i][j]=obj.nextInt();
    		  }
    	  }
    	  System.out.println("enter matrix two");
    	  for(int i=0;i<row;i++)
    	  {
    		  for(int j=0;j<col;j++)
    		  {
    			  b[i][j]=obj.nextInt();
    		  }
    	  }
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			System.out.print( c[i][j]=a[i][j]+b[i][j]);
			 
		  }
		  System.out.println();
	  }
	 
    	  
      }
      }

    	  
    	  
    	  
    	  
    	  
    	  
