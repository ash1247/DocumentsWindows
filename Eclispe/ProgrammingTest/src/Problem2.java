import java.util.*;
import java.util.Map.Entry;
 
public class Problem2 {
     
    public static void main(String[] args){
        HashMap<Integer, Integer> hm  = new HashMap<Integer, Integer>();
        int rows;
        int id = 0;
        int marks = 0;
        int search = 0;
        int i = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many rows you want to enter: ");
        rows = input.nextInt();
       
	    for(i = 1; i <= rows; i++)
	    {
	      	System.out.println();
	      	try
	        {
	      		System.out.printf("Enter your ID: ");
	      		id = input.nextInt();
	      		System.out.printf("Enter your marks: ");
	       		marks = input.nextInt();
	        }
	        catch ( InputMismatchException e )
	        {
	        	System.err.println( "Invalid input. Please try again.\n" );
	        	input.nextLine(); // discard input so user can try again
	        	i = i - 1;
	        }
	       	catch ( NoSuchElementException e )
	        {
	       		System.err.println( "Invalid input. Please try again.\n" );
	       		input.nextLine(); // discard input so user can try again
	       		i = i - 1;
	        }
	        	
	       	hm.put(id, marks);        
	    }
        
	    System.out.printf("Enter your search item: ");
        search = input.nextInt();
        
	        if(hm.containsValue(search) )
	        {
	        	for (Entry <Integer, Integer> entry : hm.entrySet() ) 
	        	{
	                if (entry.getValue().equals(search)) 
	                {
	                    System.out.printf("\nID %d got %d marks.\n", entry.getKey(), search);
	                }
	           
	        	} 
	        }
	        else if(hm.containsKey(search) )
	        {
	            System.out.printf("\nID %d got %d marks\n", search, hm.get(search) );
	        } 
	        else 
	        {
	            System.out.println("The item you wanted to search is not available\n");
	        }    
       
    }
}
