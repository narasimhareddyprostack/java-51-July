package functionEx2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<Integer> c1 = (ele)->{
			System.out.println(ele);
		};
		Consumer<List> c2 = (enames)->{
			for(Object ename:enames) {
				System.out.println(ename);
			}
		};
		
		List enames=new ArrayList();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		
		c1.accept(100);
		c2.accept(enames);

	}

}
