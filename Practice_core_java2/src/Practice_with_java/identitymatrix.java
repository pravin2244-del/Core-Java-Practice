package Practice_with_java;

public class identitymatrix {
	public static void main(String[] args)
	{
		int arr[][] = new int [2][2];
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		
		boolean onecheck = true;
		boolean zerocheck = true;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(i==j)
				{
					if(arr[i][j]!=1)
					{
						onecheck = false;
					}
				}
				else
				{
					if(arr[i][j]!=0)
					{
						zerocheck = false;
					}
				}
					
			}
		}
		if(onecheck && zerocheck)
		{
			System.out.println("Identity matrix");
		}
		else
		{
			System.out.println("Simple matrix:");
		}
	}

}
