package learningjava;
import java.util.Scanner;
public class switchkey {
     public static void main(String[] args) {
    	 Scanner obj=new Scanner(System.in);
    	 System.out.println("enter the character");
    	 char ch=obj.nextLine().charAt(0);
    	 System.out.println("enter the value of a and b");
    	 int a=obj.nextInt();
    	 int b=obj.nextInt();
    	
    	 int result=0;
    	 switch(ch) {
    	 case '+':result=a+b;
    	 break;
    	 case '-':result=a-b;
    	 break;
    	 case '*':result=a*b;
    	 break;
    	 case '/':result=a/b;
    	 break;
    	 case '%':result=a%b;
    	 break;
    	 default :System.out.println("invalid character!");
    	 }
    	 System.out.println("the result is "+ result);
     }
}
