//Example 6.1
//Program of counting for the given values
public class Example61 {

	public static void main(String[] args) 
	{
		int i, count, count1, count2;
		float[] weight = { 45.0F, 55.0F, 47.0F, 51.0F, 54.0F };
		float[] height = { 176.5F, 174.2F, 168.0F, 170.7F, 169.0F };
		
		count = 0;
		count1 = 0;
		count2 = 0;
		for (i = 0; i <= 4; i++)
		{
			if(weight[i] < 50.0 && height[i] > 170.0)
			{
				count1 = count1 + 1;
			}
			count = count + 1;
		}
		count2 = count - count1;
		
		System.out.println("Number of persons with ...\n");
		System.out.printf("Weight < 50 and height > 170 = %d\n", count1);
		System.out.printf("Others = %d\n" , count2);
	}

}
