package regexdemo;

import java.util.regex.Pattern;

public class regex3 
{
	public static void main(String[] args) 
	{
		boolean b1 = Pattern.matches("[abc]?", "a");
		boolean b2 = Pattern.matches("[a-zA-Z0-9]{6,}", "Kalyani123456");
		
		//for phone number
		boolean phone = Pattern.matches("[6789]{1}[0-9]{9}", "6532896532");
		boolean phone1 = Pattern.matches("[6789][0-9]{9}","5897643527");
		
		System.out.println(b1+" "+b2+" "+phone+" "+phone1);
	}

}
