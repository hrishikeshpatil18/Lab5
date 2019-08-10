package Lab5;					// throw user defined exception if age is less than 15

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class Exercise5 {
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<15)
			throw new InvalidAgeException("Not Valid");
		else
			System.out.println("Valid age");
			
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try
		{
		validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception occure "+e);
		}
	}

}
