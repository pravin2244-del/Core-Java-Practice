package Contract;

public class Genericsinjavatwo {
	
	public static void main(String[] args)
	{
		
		I_Travel<Integer,String,String> t = new Bus();
		
		System.out.println(t.travelling(18, "ViratKohali"));
		
		
		
	}

}

interface I_Travel<T,R,U>

{
	public R travelling(T t1,U u1);
}

class Bus implements I_Travel<Integer,String,String>
{

	@Override
	public String travelling(Integer t1, String u1) {
		// TODO Auto-generated method stub
		return  t1+u1;
	}
	

	

	
}
