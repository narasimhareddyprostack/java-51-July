package functionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class TestTwo {
	static Function<Integer, Integer> f1=num ->num*num;
	
	static Function<String, Integer> f2=str->str.length();
	static Function<Collection,Integer> f3=c->c.size();
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out	.println(f1.apply(5));
		System.out.println(f2.apply("Rahul Gandhi"));
		System.out.println(f3.apply(al));
	}
}
