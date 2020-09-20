package learningjava;
import java.util.Scanner;
public class AToThePowerB {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of a and b");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int ans=1;
		int i;
		for(i=0;i<b;i++) {
			ans=ans*a;
		}
		System.out.println(ans);
	}

}
