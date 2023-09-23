package lambda;

public class TestOne {
	
static CalcInterface obj=(a,b)->a+b;

public static void main(String[] args) {
	System.out.println(obj.add(5, 6));
}

}
