package langex;

public class UnBoxingEx {

	public static void main(String[] args) {
		Integer i = 100;
		//Integer i = Integer.value(100);
		//int a = i;
		int a = i.intValue();
		float b = i.floatValue();
		double c = i.doubleValue();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
