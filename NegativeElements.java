import java.util.Scanner;

public class NegativeElements 
{
	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Size : ");
         int size = sc.nextInt();
         
         int[] arr = new int[size];
             
         System.out.println("Enter Array Elements : ");
         for(int i=0 ; i<size ; i++) {
        	 arr[i] = sc.nextInt();
         }
         
         System.out.println("Negative Elements in Array  : ");
         for(int i=0 ; i<size ; i++) {
        	 if(arr[i] < 0 )
        		 System.out.println(arr[i]);
         }     
	}
}