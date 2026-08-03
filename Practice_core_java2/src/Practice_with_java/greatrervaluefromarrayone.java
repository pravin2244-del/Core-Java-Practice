package Practice_with_java;

public class greatrervaluefromarrayone {
	public static void main(String[] args)
	{
		int array[] = new int[5];
		array[0] = 43;
		array[1] = 54;
		array[2]= 33;
		array[3] = 89;
		
		int num = -2147483648;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>num)
			{
				num = array[i];
			}
		}
		System.out.println(num);
	}

}
