package filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile 
{
	public static void main(String[] args) 
	{
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try
		{
			fs = new FileInputStream("D:\\file\\letter.txt");
			fo = new FileOutputStream("D:\\file\\copy.txt");
			
			int i;
			
			while((i=fs.read())!=-1)
			{
				fo.write(i);
			}
			System.out.println("File copied successfully!!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(fs==null)
					fs.close();
				if(fo==null)
					fo.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
