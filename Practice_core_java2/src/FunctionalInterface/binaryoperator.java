package FunctionalInterface;

//import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class binaryoperator {
	//BinaryOperator extends (in the form of) BiFunction<T,T,T>
	public static void main(String[] args)
	{
		BinaryOperator<Integer> op = (i1,i2)->{return i1+i2;};
		
		System.out.println(op.apply(23,44));
	}

}
