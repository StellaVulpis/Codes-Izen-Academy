package day11;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_Scanner 
{
	
	Scanner sc = new Scanner(System.in);
	Scanner tc = new Scanner(System.in);
	
	public String scanfStr(String text)
	{
		System.out.print(text);
		System.out.print(": ");
		return sc.nextLine();
	}
	public int scanfInt(String text)
	{
		System.out.print(text);
		System.out.print(": ");
		return sc.nextInt();
	}
	
}
