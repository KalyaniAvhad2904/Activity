package filestream;

import java.io.FileInputStream;

public class FileInputStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("D:\\\\file\\\\letter.txt");
			System.out.println("Remaining bytes:"+fis.available());
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.println((char)i);
			}
			System.out.println();
			System.out.println("Remaining bytes:"+fis.available());
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
