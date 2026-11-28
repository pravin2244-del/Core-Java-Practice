package Polymorphism;

public class MethodOverloadingtwo {
	
	public static void main(String[] args)
	{
		
		North abc = new North();
		abc.suffer();
		
	}

}

class North
{
	public void suffer()
	{
		System.out.println("North rembers we know know king:");
	}
	
	public void suffer(String i,int n)
	{
	 System.out.println("but king in the north his name is stark:");
		
	}
}
