package cfone;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItr {

	public static void main(String[] args) {
		ArrayList<Integer> ids=new ArrayList<Integer>();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		
		Iterator itr=ids.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
