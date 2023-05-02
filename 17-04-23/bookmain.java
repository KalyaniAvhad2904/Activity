//Book Management System using Array
import java.util.Scanner;

public class bookmain 
{
	public static void main(String[] args) 
	{
		bookservice bservice = new bookservice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our Book Management System");
		
		do 
		{
			System.out.println("Press \n 1 To Create Book \n 2 To Get All Book Details \n 3 To Get Book Details using Id \n 4. To Get Book Details using Name \n 5. To Update Book \n 6. Exit  ");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				bservice.createBook();
				System.out.println();
                break;
				
			case 2 :
				bservice.getAllBookDetails();
				System.out.println();
				break;
				
			case 3:	
				bservice.getBookDetailsById();
				System.out.println();
				break;
				
			case 4:
				bservice.getBookDetailsByName();
				System.out.println();
				break;
				
			case 5 :
				bservice.bookUpdate();
				
			case 6:
				System.out.println("Thanks for visiting !");
				System.exit(0);
			
			default:
				System.out.println("You entered wrong choice !");	
			}
		}
		while(true);	
	}
}
