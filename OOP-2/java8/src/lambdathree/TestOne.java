package lambdathree;

public class TestOne implements FunctionOne {

	
	public int apply(int a) {
	
		return a*a;
	}
	public static void main(String[] args) {
		FunctionOne obj=new TestOne();
		System.out.println(obj.apply(10));
	}

}
