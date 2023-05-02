import java.util.Scanner;


public class paliloop2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		sb=sb.reverse();
		String s2=sb+"";
		if(s1.equals(s2))
		{
			System.out.println("It is a Palindrom");
		}
		else
		{
			System.out.println("It is not a Palindrom");
		}
	}

}
