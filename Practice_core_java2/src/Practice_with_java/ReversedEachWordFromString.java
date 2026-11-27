package Practice_with_java;

public class ReversedEachWordFromString {
	
public static void main(String[] args)
{
	String str = "john snow avenged the red wedding";
	
	String[] words = str.split(" ");
	
	String result = " ";
	
	for(int i=0;i<words.length;i++)
	{
		String word = words[i];
		String reverse = " ";
		
		for(int j=word.length()-1;j>=0;j--)
		{
			reverse = reverse+word.charAt(j);
		}
		
		result = result+reverse+ " ";
		
	}
	
	System.out.println(result);
 }

}
