package learningjava;
import java.util.Scanner;
public class Bubblesort {
     public static void main(String[] args)
     {
    	 Scanner obj=new Scanner(System.in);
      	 int a[]=new int[5];
    	 System.out.println("enter the array elements needed to eb sorted");
    	 for(int i=0;i<5;i++)
    	 {
    	    a[i]=obj.nextInt(); 
    	 }
    	 System.out.println("array elemens before sorting");
    	 for(int i=0;i<5;i++)
    	 {
    	 System.out.print(a[i]);  
    	
    	 }
    	 System.out.println();
    	 
    	
    	 int n=a.length;
    	 for(int i=0;i<n-1;i++) {
    		 for(int j=0;j<n-1;j++)
    		 {
    			 if(a[j+1]<a[j]) {
    				 int temp=a[j+1];
    				 a[j+1]=a[j];
    				 a[j]=temp;
    			 }
    		 }
    	 }
    	 for(int item:a)
    	 {
    		 System.out.print(item+" ");
    	 }
    	 }
       }
