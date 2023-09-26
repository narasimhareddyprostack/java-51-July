package lambdaFour;

public class TestOne implements PredicateI {

	
	public boolean test(int num) {
		
		if(num >100) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
	PredicateI	t=new TestOne();
	System.out.println(t.test(120));
	}

}
