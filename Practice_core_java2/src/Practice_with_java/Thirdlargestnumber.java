package Practice_with_java;

public class Thirdlargestnumber {
	
	public static void main(String[] args)
	{
		int[] array = {-12,-33,878,973,522,22,11};
		
		int largest = array[0];
		int secondlargest = array[0];
		int thirdlargest = array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondlargest = largest;
				largest = array[i];
			}
			
			else if(array[i]>secondlargest)
			{
				secondlargest = array[i];
			}
			
			else if(array[i]>thirdlargest)
			{
				thirdlargest = array[i];
			}
		}
		
		System.out.println(thirdlargest);
	}

}
