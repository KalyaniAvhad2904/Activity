package regexdemo;

import java.util.regex.Pattern;

public class regex4 
{
	public static void main(String[] args) 
	{
		boolean f1 = Pattern.matches("[\\w]{6,}", "Kalyani12");
		boolean phone = Pattern.matches("[6789]\\d{9}","6547808658");
		boolean email = Pattern.matches("[a-z0-9+_.-]+@[a-z]+\\.[a-z]{3}","kalyani245@gmail.com");
		System.out.println(f1+" "+phone+" "+email);
	}

}
