package lambdaFour;

public class TestTwo {
static	PredicateI t=(int num)->{ 
		if(num>100) {
			return true;
					}else {
		return false;
					}
	    };
public static void main(String[] args) {
	System.out.println(t.test(50));
}
}
