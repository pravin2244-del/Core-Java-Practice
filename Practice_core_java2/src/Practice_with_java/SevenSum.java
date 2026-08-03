package Practice_with_java;

public class SevenSum {
	
	public static void main(String[] args)
	{
		int[] arr = {1,6,5,2,9,1,4};
		
		// find numbers which contain sum
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==7)
				{
					System.out.println(arr[i]+"+"+arr[j]+"=7");
				}
			}
		}
	}

}
