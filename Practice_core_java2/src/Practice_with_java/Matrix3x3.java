package Practice_with_java;

public class Matrix3x3 {
	
	public static void main(String[] args)
	{
		int[][] array = new int[3][3];
		int sum = 0;
		int counter =0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				array[i][j]=counter;
				sum = sum+array[i][j];
				counter++;
			}
		}
		
		
		System.out.println("Matrix:");
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("sum:"+sum);
		System.out.println("Count:"+counter);
	}

}
