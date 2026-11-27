package Practice_with_java;

public class Secondlargestnumber {
	public static void main(String[] args)
	{
		int[] array = {23,98,45,4,37,6,56};
		//int num = -2147483647;
		
		int largest = array[0];
		int secondLargest = array[0];
		
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondLargest = largest;
				largest = array[i];
			}
			else if(array[i]>secondLargest)
			{
				secondLargest = array[i];
			}
				
		}
		
		System.out.println("largest number:"+largest);
		System.out.println("Second Largest:"+secondLargest);
	}

}



