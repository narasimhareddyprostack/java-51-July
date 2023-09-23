package lambda;

public class Test {
	public static void main(String[] args) {
	//CalcInterface obj=(int a, int b)->{ return a+b; };
	CalcInterface obj=(a,b)->a+b;
	System.out.println(obj.add(5, 6));
	}
}
