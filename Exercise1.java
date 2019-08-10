package Lab5;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String s="";
		do
		{
			System.out.println("*** Choose anyone of the following light ***");
			System.out.println("1. RED");
			System.out.println("2. YELLOW");
			System.out.println("3. GREEN");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("STOP...");
				break;
			case 2:
				System.out.println("READY...");
				break;
			case 3:
				System.out.println("GO...");
				break;
			default:
				System.out.println("Invalid choice...");
				
			}
			
			System.out.println("Do you want to continue..??  Y/N");
			s=sc.next();
			
		}
		while((s.equals("Y"))||(s.equals("y")));
		
	}

}
