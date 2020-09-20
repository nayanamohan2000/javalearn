package learningjava;
import java.util.Scanner;
public class ifkeyword {
	public static void main(String[] args)
	{
		System.out.println("enter your age");
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		if(age>=18) {
			System.out.println("you can vote now!");
		}
		System.out.println("you can't");
	}

}
