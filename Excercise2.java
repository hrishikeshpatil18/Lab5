package Lab5;

import java.util.Scanner;

public class Excercise2 {
	
	static void nonRecursiveFibo(int num)
	{
		int t1=0,t2=1,t3;
		for(int i=1;i<num;i++)
		{
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		System.out.println(num+"th"+" fibbonaci term using non recursion "+t2);
		
	}
	static int recursiveFibo(int num)
	{
		if(num<=1)
			return num;
		
		return recursiveFibo(num-1)+recursiveFibo(num-2);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		nonRecursiveFibo(num);
		int result=recursiveFibo(num);
		System.out.println(num+"th"+" fibbonaci term using recursion "+result);
	}

}
