package filestream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw = new FileWriter("D:\\file\\letter.txt");
			fw.write("We are learning to use file writer.");
			
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//read from a file
		try
		{
			FileReader fr = new FileReader("D:\\file\\letter.txt");
			int i;
			
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Success");
	}

}
