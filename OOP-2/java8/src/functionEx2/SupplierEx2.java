package functionEx2;

import java.util.function.Supplier;

public class SupplierEx2 {
	static String enames="Rahul Gandhi";
	
	
	public static void main(String[] args) {
		 Supplier<Boolean> s1 = ()->{
			return enames.length()<5;
		};
		
		System.out.println(s1.get());
		

	}

}
