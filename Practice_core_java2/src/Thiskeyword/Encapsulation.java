package Thiskeyword;

public class Encapsulation {
	
	public static void main(String[] args)
	{
		Facebook face = new Facebook();
		face.setPass("1232333333");
		//System.out.println(face.getPass());
		
		face.displayPassword();
		
		face.name = "Eternals";
		System.out.println(face.name);
				
		
	}

}

class Facebook
{
	String name;
	private String password;
	
	public void displayPassword()
	{
		System.out.println(this.password);
	}
	
	public void setPass(String SP)
	{
		if(SP.length()<=10)
		{
		this.password = SP;
		}
	
	}
	
	/*public String getPass()
	{
		return this.password; 
		
		
	} */
	
	public Facebook()
	{
		System.out.println("Facebook is the ultimate class");
		
	}
}
