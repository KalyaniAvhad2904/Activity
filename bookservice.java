import java.util.Scanner;

public class bookservice 
{
	static book book[] = new book[10];  // creating array of Book type
	static Scanner sc = new Scanner(System.in);

	static int index=0;
	
    //creatong createbook method
	public static void createBook()
	{
		System.out.println("Enter book id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter book Name : ");
		String bname = sc.nextLine();
		
		System.out.println("Enter book Price : ");
		double price = sc.nextDouble();
		
		book[index]= new book(id, bname, price);
		index++;
		System.out.println("Book Details created successfully...");
	}
	
	//get all book details method
	public static void getAllBookDetails() 
	{
		for(int i=0;i<index;i++) {
			System.out.println("Book Id : " + book[i].getBookId());
			System.out.println("Book Name : " + book[i].getBookName());
			System.out.println("Book Price : " + book[i].getBookPrice());
			System.out.println("----------------------------------");
		}
	}
	
	//get book details based on id
	public static void getBookDetailsById() 
	{
		System.out.println("Enter id to search: ");
		boolean flag = false;
		int id = sc.nextInt();
		
		for(int i=0;i<index ;i++) 
		{
			if(book[i].getBookId()==id) 
			{
				System.out.println("Book Id : " + book[i].getBookId());
				System.out.println("Book Name : " + book[i].getBookName());
				System.out.println("Book Price : " + book[i].getBookPrice());
				System.out.println("----------------------------------");
				flag=true;
			}
			else
			{
				if(flag==true)
					System.out.println("Book not found..!!");
			}
		}
		
	}	
    //--------------------------------------------
     public static void getBookDetailsByName() 
     {
		System.out.println("Enter book name to search: ");
		sc.nextLine();
		boolean flag = false;
		String bname = sc.nextLine();
	
		for(int i=0;i<index ;i++) 
		{
			if(book[i].getBookName().equalsIgnoreCase(bname)) 
			{
				System.out.println("Book Name : " + book[i].getBookName());
				System.out.println("Book Id : " + book[i].getBookId());
				System.out.println("Book Price : " + book[i].getBookPrice());
				System.out.println("----------------------------------");
				flag=true;
				break;
			}
			
		}
		if(flag==false)
			System.out.println("Book not found !!");
	}
	
	public static void bookUpdate() 
	{
    	boolean flag=false;
    	System.out.println("Enter the book id you want to replace");
    	int id=sc.nextInt();
    	
    	for(int i=0 ; i<index ; i++) 
    	{
    		if(id==book[i].getBookId()) 
    		{
    			sc.nextLine();
    			System.out.println("Enter the New Book Name: ");
    			String bname = sc.nextLine();
    			
    			System.out.println("Enter New Book Price: ");
    			double bprice = sc.nextDouble();
    			
//    			book[i].setBookName(bname); //using setter methods
//    			book[i].setBookPrice(bprice);
//    			
    			book[i] = new book(id, bname, bprice);
    			flag=true;
    		}
    	}
    	
    	if(flag==true) 
    	{
    		System.out.println("Book is updated successfully...!");
    	}
    	else
    		System.out.println("Book id " + id + " not found...! ");
    }	
}