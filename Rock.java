import java.util.Scanner;
import java.util.Random;
public class Rock
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSOR");
		int userInput=sc.nextInt();
		Random random=new Random();
		int computerInput=random.nextInt(3);
		if(userInput==computerInput)
		{
			System.out.println("DRAW");
		}
		else if(userInput==0&&computerInput==2||userInput==1&&computerInput==0||userInput==2&&computerInput==1)
		{
			System.out.println("YOU WIN");
		}
		else
		{
			System.out.println("COMPUTER WIN");
		}
		if(computerInput==0)
		{
			System.out.println("COMPUTER CHOICE:ROCK");
		}
		if(computerInput==1)
		{
			System.out.println("COMPUTER CHOICE:PAPER");
		}
		if(computerInput==2)
		{
			System.out.println("COMPUTER CHOICE:SCISSOR");
		}
	}
}