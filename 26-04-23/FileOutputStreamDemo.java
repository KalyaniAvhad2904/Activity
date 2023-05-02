package filestream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\file\\letter.txt");
			fos.write(65);
			String s="Welcome to java stream";
			byte b[]=s.getBytes();
			
			fos.write(b);
			fos.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
