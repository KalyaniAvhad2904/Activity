package regexdemo;

import java.util.regex.Pattern;

public class regex1 
{
	public static void main(String[] args) 
	{
		boolean b = Pattern.matches("[abc]","r");
		boolean b1 = Pattern.matches("[^abc]","s");
		boolean b2 = Pattern.matches("[a-zA-Zabc]","A");
		System.out.println(b+" "+b1+" "+b2 );
	}

}
