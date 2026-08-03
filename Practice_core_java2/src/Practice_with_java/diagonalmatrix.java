package Practice_with_java;

public class diagonalmatrix {
	
	public static void main(String[] args)
	{
		int arr[][] = new int[2][2];
		arr[0][0]=4;
		arr[0][1]=0;
		
		arr[1][0]=0;
		arr[1][1]=4;
		
		boolean zerocheck = true;
		boolean nonzerocheck = true;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//condition to check matrix is diagonal or simple
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(i==j)
				{
					if(arr[i][j]==0)
					{
						nonzerocheck = false;
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
		if(zerocheck && nonzerocheck)
		{
			System.out.println("Diagonal matrix");
		}
		else
		{
			System.out.println("Simple matrix");
		}
	}

}
