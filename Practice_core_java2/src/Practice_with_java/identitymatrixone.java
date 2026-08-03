package Practice_with_java;

public class identitymatrixone {
	public static void main(String[] args)
	{
		int arr[][] = new int [3][3];
		arr[0][0]=1;
		arr[0][1]=0;
		arr[0][2]=0;
		
		arr[1][0]=0;
		arr[1][1]=1;
		arr[1][2]=0;
		
		arr[2][0]=0;
		arr[2][1]=0;
		arr[2][2]=1;
		
		boolean onecheck =false;
		boolean zerocheck =false;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					if(arr[i][j]!=1)
					{
						onecheck = true;
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
		if(!onecheck && !zerocheck)
		{
			System.out.println("Identity matrix:");
		}
		else
		{
			System.out.println("simple matrix:");
		}
		
	}

}
