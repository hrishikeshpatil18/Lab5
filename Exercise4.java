package Lab5;				//throw user defined exception if first and last name is blank

import java.util.Scanner;

class InvalidNameException extends Exception
{
	 InvalidNameException(String s)
	 {
		 super(s);
	 }
}
public class Exercise4 
{
	static void validateName(String s1,String s2) throws InvalidNameException
	{
		if(s1.isEmpty() || s2.isEmpty())
			throw new InvalidNameException("Name cannot be null");
		else
			System.out.println("Valid name entered");
			
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname=sc.nextLine();
		
		System.out.println("Enter the last name");
		String lname=sc.nextLine();
		
		try
		{
			validateName(fname,lname);
		}
		catch(Exception e)
		{
			System.out.println("Exception occures "+e);
		}
	}

}
