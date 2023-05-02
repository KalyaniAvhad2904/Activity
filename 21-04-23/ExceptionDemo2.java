package exception;

import java.util.Scanner;

public class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		//JAVA Nested Try Block
		try
		{
			try
			{
				int a=30, b=0;
				System.out.println("Division: "+(a/b));
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot be divided by zero.");
			}
			int arr[]=new int[5];
			arr[5]=78;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured: Array Index Out Of Bounds!");
		}
		finally
		{
			sc.close();
			System.out.println("Finally block always gets executed");
		}
	}

}
