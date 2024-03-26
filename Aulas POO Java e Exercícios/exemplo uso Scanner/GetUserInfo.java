import java.util.Scanner;
public class GetUserInfo
{
	public static void main(String[] args)
	{
	String name;
	Scanner inputDevice = new Scanner(System.in);
	System.out.println("digite seu nome:");
	name = inputDevice.nextLine();
	System.out.println("Seu nome é:"+name);
	
	}
}