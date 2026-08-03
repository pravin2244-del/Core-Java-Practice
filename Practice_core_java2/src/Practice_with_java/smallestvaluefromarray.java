package Practice_with_java;

public class smallestvaluefromarray {
	public static void main(String[] args)
	{
		int arr[] = {98,-9887,-4332,-433,87};
		int num = 2147483647;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<num)
			{
				num = arr[i];
			}
		}
		System.out.println(num);
		
	}

}
