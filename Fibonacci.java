package learningjava;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the n");
		int n=obj.nextInt();
		int a=0;
		int b=1;
		int c;
		int i;
		System.out.println(  a);
		System.out.println(  b);
		for(i=1;i<=n-2;i++) {
			c=a+b;
			System.out.println(  c);
			a=b;
			b=c;
		}

	}

}
