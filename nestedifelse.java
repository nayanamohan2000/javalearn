package learningjava;
import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {
    	Scanner obj=new Scanner(System.in);
    	System.out.println("enter the operator(+,,*,/,%)");
    	char ch=obj.nextLine().charAt(0);
    	System.out.println("enter two numbers");
    	int a=obj.nextInt();
    	int b=obj.nextInt();
        int result=0;
    	if(ch=='+') {
    		System.out.println( result=a+b);
    	}
    	else if(ch=='-')
    	{
    		System.out.println(	result=a-b);
    	}
    	else if(ch=='*')
    	{
    		System.out.println(result=a*b);
    	}
    	else if(ch=='/')
    	{
    		System.out.println(result=a/b);
    	}
    	else if(ch=='%') {
    		System.out.println(result=a%b);
    		
    	}
    	else {
    		System.out.println("invalid character!!!");
    	}
    }
}
