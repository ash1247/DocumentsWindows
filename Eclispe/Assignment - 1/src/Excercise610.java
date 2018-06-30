//Exercise 6.10
//This is the best I could do in the given time.
//program on square root table of values that starts from 0 and ends in 9.9 with an increment of .1.
public class Excercise610 {
	public static void main(String [] args)
	{
		          float hor[] = new float[10];
		          float ver[] = new float[10];
		          int p = 0;
		          int q = 0;
		          float i = 0.0f;
		          float j = 0.0f;
		          double sum = 0.0f;
		          while( p < 10 )
		          {   
		                 hor[p] = j;
		                 
		                 ver[p] = i;
		                 
		                 i = i + 0.1f;
		                 j = j + 1.0f;
		                 p = p + 1;
		                
		        }
		          System.out.print("Number\n");
		          System.out.print("0.0     0.1         0.2         0.3         0.4         0.5         0.6         0.7         0.8         0.9     \n");
		          
		          
		        for(p = 1; p < 10; p++)
		        {
		        
		             System.out.print(ver[p] +"     ");
		             for(q = 1; q < 10; q++)
		             {
		            	 
		                 sum = (Math.sqrt(hor[p] + ver[p]));
		                 System.out.printf("%f    ", sum);
		            }
		            System.out.println();
		        }
	}
}

		    
		
	

