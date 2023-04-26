package regexdemo;

import java.util.regex.Pattern;

public class regex5 
{
	public static void main(String[] args) 
	{
		boolean b=Pattern.matches("[a-z]\\w{1,10}@gmail{1}\\.[a-z]{3}","kalyani@gmail.com");
		System.out.println(b);
	}

}
