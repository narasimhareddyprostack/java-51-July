package cfset;

import java.util.HashSet;

public class HastSetTwo {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		//default capacity - 16 
		//fillratio/load factor - 0.75f
		HashSet hs2=new HashSet(100, 0.5f);
		System.out.println(hs1);
		System.out.println(hs2);
		
		hs1.add(10);
		hs1.add(10);
		hs1.add("Hello");
		hs1.add(10);
		hs1.add(true);
		System.out.println(hs1);
	}

}
