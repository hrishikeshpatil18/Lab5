package Lab5;
import com.cg.eis.exception.*;
import java.util.Scanner;

public class Exercise6 
{
	static void validateSalary(int id,String name,long salary) throws EmployeeException
	{
		if(salary<3000)
		{
			throw new EmployeeException("Salary is less than 3000");
		}
		else
			System.out.println("Emp id: "+id+"\t Emp name: "+name+"\t Emp salary"+salary);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		
		System.out.println("Enter employee name");
		String name1=sc.next();
		
		System.out.println("Enter employee salary");
		long salary=sc.nextLong();
		sc.close();
		try
		{
			validateSalary(id,name1,salary);
		}
		catch(Exception e)
		{
			System.out.println("Exception occure: "+e);
		}
	}

}
