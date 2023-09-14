package cfset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> s1=new HashSet<Integer>(10,0.9f);
		HashSet<Integer> s2=new HashSet<Integer>(10,0.9f);
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		
		//s2.removeAll(s1);
		//System.out.println(s2);
		
		System.out.println(s1.containsAll(s2));
		
	}

}
