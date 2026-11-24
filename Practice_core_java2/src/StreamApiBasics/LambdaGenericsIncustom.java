package StreamApiBasics;

public class LambdaGenericsIncustom {
	
	public static void main(String[] args)
	{
		I_rim<Integer,Car> ir = (i1,i2)->{return new Car(i1,i2);};
		
		System.out.println(ir.add(23, 78));
		
				
		
	}

}

interface I_rim<T,R>
{
	R add(T t1,T t2);
}

class Car 
{
	public Car(int i,int j)
	{
		System.out.println(("@@@@@@@@@@@@@@@@@@@@@"));
	}
}
