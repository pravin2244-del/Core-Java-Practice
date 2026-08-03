package Practice_with_java;

public class PalindromeStringone {
	public static void main(String[] args)
	{
		String str1 = "choclate cool";
		String str2 = "";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2 = str2+str1.charAt(i);
			str2 = str2.stripTrailing();
			
		}
	    System.out.println(str2);
		
	    if(str1.equals(str2))
	    {
	    	System.out.println("Given string is palindrome:");
	    }
	    else
	    {
	    	System.out.println("Not a palindrome:");
	    }
	}

}
