package Practice_with_java;

public class greatrervaluefromarray {
	public static void main(String[] args)
	{
		int arr[] = {89,54,534,2334};
		int num = -2147483648;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				num = arr[i];
			}
			
		}
		System.out.println(num);
	}

}
