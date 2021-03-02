import java.util.Scanner;
public class Prog2
{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Integer");
		Integer num1  = Integer.parseInt(input.nextLine());
		System.out.println("Enter Second Integer");
		Integer num2  = Integer.parseInt(input.nextLine());		int sum = num1 + num2;
		System.out.println("Sum of both Integer : " + sum);
		
	}


}