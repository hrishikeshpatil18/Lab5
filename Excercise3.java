package Lab5;

import java.util.Scanner;

public class Excercise3 {
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)	
				
					flag=1;
				
			 }
			
			if(flag==0)
			{
				System.out.println(i);
			}
				
			}
		
		}

}

