package Practice_with_java;

public class Countzerosingivenarray {
	public static void main(String[] args)
	{
		int [] arr = {9,4,0,7,6,5,0,3,0};
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			
		}
		System.out.println("Count:"+count);
		
		
		
	}

}
