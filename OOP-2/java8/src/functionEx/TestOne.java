package functionEx;

import java.util.function.Function;

@FunctionalInterface
interface FunctionOne{
	int apply(int num);
}
public class TestOne implements FunctionOne {
	public  int apply(int num){
		return num*num;
	}
	public static void main(String[] args) {
		FunctionOne f1=new  TestOne();
		System.out.println(f1.apply(10));
	}

}
