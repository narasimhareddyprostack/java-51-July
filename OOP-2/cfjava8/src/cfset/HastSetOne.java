package cfset;

import java.util.ArrayList;
import java.util.HashSet;

public class HastSetOne {

	public static void main(String[] args) {
		ArrayList	al1=new ArrayList();
		al1.add(10);
		al1.add("Rahul");
		al1.add(10);
		al1.add(true);
		al1.add(null);
		
		System.out.println(al1);
		
		HashSet hs1=new HashSet();
		hs1.add(10);
		hs1.add("Rahul");
		hs1.add(10);
		hs1.add(true);
		hs1.add(null);
		System.out.println(hs1);
	}

}
