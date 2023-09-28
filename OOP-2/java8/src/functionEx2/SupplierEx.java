package functionEx2;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		Supplier<Integer> s1 = ()->{
			return 100;
		};
		
		int value = s1.get();
		System.out.println(value);

	}

}
