package Practice_with_java;

public class SecondLowestnumber {
	
	public static void main(String[] args)
	{
		int[] array = {23,90,-343,-56,444,-345};
		
		int LowestNumber = array[0];
		int SecondLowest = array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<LowestNumber)
			{
				LowestNumber = SecondLowest;
				LowestNumber = array[i];
			}
			else if(array[i]<SecondLowest)
			{
				
				SecondLowest = array[i];
			}
		}
		System.out.println("Lowestnumber:"+LowestNumber);
		System.out.println("SecondLowest:"+SecondLowest);
		
	}

}
