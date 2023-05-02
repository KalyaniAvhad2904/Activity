import java.util.Scanner;


public class paliloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.next();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
			rev=rev+s1.charAt(i);
			if(s1.equals(rev))
			{
				System.out.println("It is a Palindrom");
			}
			else
			{
				System.out.println("It is not a Palindrom");
			}
			
		
		
	}

}
