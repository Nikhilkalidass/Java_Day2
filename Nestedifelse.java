package nandu; 
import java.util.Scanner;
public class Nestedifelse {
	public static void main(String[] args) {
		int a=1;
		Scanner me=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=me.nextInt();
		
		if(age>18)
		{
			System.out.println("Enter your weight:");
			int we=me.nextInt();
			System.out.println("Under age");
			
			if(we>50)
			{
				System.out.println("Age and weight can be satisifed");
			}
			else
			{
				System.out.println("Under weight");
			}
			}
		else
		{
			System.out.println("Age is not satisifed");
		}
		
	}
	}
