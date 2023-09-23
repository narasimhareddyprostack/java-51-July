package lambdathree;

import java.util.function.Function;

public class TestTwo {
 static	Function<Integer,Integer> obj = (a)->{return a*a;};
	public static void main(String[] args) {
		
		//FunctionOne obj=(int a)->{ return a*a;};
		//Function<Integer,Integer> obj = (a)->{return a*a;};
		System.out.println(obj.apply(10));
	}

}
