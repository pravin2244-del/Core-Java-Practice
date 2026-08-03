package Practice_with_java;

public class diagonalmatrixone {
	
	public static void main(String[] args)
	{
		int arr[][] = new int[3][3];
		arr[0][0]=20;
		arr[0][1]=0;
		arr[0][2]=0;
		
		arr[1][0]=0;
		arr[1][1]=30;
		arr[1][2]=0;
		
		arr[2][0]=0;
		arr[2][1]=0;
		arr[2][2]=10;
		
		boolean zerocheck = false;
		boolean nonzerocheck = false;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 
		
		//check diagonaol or not
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					if(arr[i][j]==0)
					{
						nonzerocheck = true;
					}
				}
				else
				{
					if(arr[i][j]!=0)
					{
						zerocheck = true;
					}
				}
			}
		}
		
		if(!zerocheck && !nonzerocheck)
		{
			System.out.println("Diagonal or Scaler");
		}
		else
		{
			System.out.println("Simple matrix");
		}
		
		
	}

}
