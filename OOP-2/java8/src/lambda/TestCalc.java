package lambda;

public class TestCalc implements CalcInterface{
	
	public int add(int a, int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		TestCalc t=new TestCalc();
		System.out.println(t.add(5, 6));
	}

	

}
/*
 *      (int a, int b)->{ 
 *    	 return a+b;
 *      }
 */
