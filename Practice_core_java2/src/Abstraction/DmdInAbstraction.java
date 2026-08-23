package Abstraction;

public class DmdInAbstraction {
	public static void main(String[] args)
	{
		Mobile mob = new Mobile();
		
		UPI upi = new Googlepay();
		
		mob.downloadap(upi);
		
		
		
	}

}

abstract class UPI
{
	String rbi = "PM";
	abstract public void showBalance();
	
}

class Phonepay extends UPI
{
	public void showBalance()
	{
		System.out.println("acount balance is:"+2300030);
	}
}

class Googlepay extends UPI
{
	public void showBalance()
	{
		System.out.println("Balance is not avalable");
	}
	
}

class Mobile
{
	public void downloadap(UPI u)
	{
		u.showBalance();
	}
}