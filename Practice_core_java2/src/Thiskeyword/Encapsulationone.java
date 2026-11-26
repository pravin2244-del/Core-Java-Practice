package Thiskeyword;

public class Encapsulationone {
	public static void main(String[] args)
	{
		Instagram Insta = new Instagram();
		Insta.setpassword("123433&$444444444444");
		
	    Insta.Displaypass();
		
	}

}

class Instagram
{
	private String password;

	int followers;
	
	public void Displaypass()
	{
		System.out.println(this.password);
	}
	
	public void setpassword(String setpass)
	{
		this.password = setpass;
	
	}
	
	public Instagram()
	{
		System.out.println("I have two intagram account");
	}
	
}
