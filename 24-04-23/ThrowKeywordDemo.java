package exception;

import java.util.Scanner;

public class ThrowKeywordDemo 
{
	static void validateAge(int age) throws AgeValidationException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote!!");
		}
		else
		{
			throw new AgeValidationException("Not eligible to vote!!");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			validateAge(age);
		}
		catch(AgeValidationException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
}
