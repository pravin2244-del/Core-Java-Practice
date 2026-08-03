package Practice_with_java;

public class vovelstar {
	public static void main(String[] args)
	{
		String str = "john snow avenged the red wedding";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)== 'a'|| str.charAt(i)== 'e' ||
					str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
