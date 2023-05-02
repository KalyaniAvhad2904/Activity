package exception;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			int arr[]=new int[5];
			arr[1]=50;
			int x=50/5;
			System.out.println("The value of x:"+x);
			String str=null;
			System.out.println(str.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println((e.getMessage()));
			System.out.println("Please check the index of array:");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Value cannot be divided by zero..!");
		}
		//Exception is like the parent class which contains all of the exceptions
		//if you do not know which exception is to be used we can simply do as below
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
