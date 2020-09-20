package learningjava;
import java.util.Scanner;
public class ifelsekey {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your id number");
		System.out.println("enter your name");
	int id=obj.nextInt();
		String name=obj.nextLine();
		if(id==59) {
			System.out.println(name +" you can enter the website");
		}
		else {
			System.out.println("error! ");	
		}
	}
}
