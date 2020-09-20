package learningjava;
import java.util.Scanner;
public class input {
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
//	System.out.println("enter p,t,r");
//	int principle=obj.nextInt();
//	int time=obj.nextInt();
//	int rate=obj.nextInt();
//	double simpleinterst=principle*time*rate/100;
//	System.out.println(simpleinterst +"is your simple inteest");
	System.out.println("enter letter and name");
	char letter=obj.nextLine().charAt(0);
	String name=obj.nextLine();
	System.out.println(name +" and "+letter);
	}

}
