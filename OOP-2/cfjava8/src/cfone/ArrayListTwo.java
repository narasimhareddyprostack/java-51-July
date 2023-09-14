package cfone;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {
		ArrayList ids1=new ArrayList();
		ids1.add(101);
		ids1.add(102);
		ids1.add(103);

		System.out.println(ids1);
		
		ArrayList ids2=new ArrayList();
		ids2.add(104);
		ids2.add(105);
		ids2.add(106);
		ids2.add(107);
		ids2.add(108);
		ids2.add(109);
		System.out.println(ids2);
		
		ids1.addAll(ids2);
		
		System.out.println(ids1);
		

	}

}
