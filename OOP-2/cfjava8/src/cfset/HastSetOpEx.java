package cfset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HastSetOpEx {

	public static void main(String[] args) {
		new HashSet(100);
		//creating hashset object with capacity 100
		//fill ratio/load factor ie  0.75f 
		HashSet<String> users=new HashSet<String>(100,0.8f);
		users.add("Rahul");
		users.add("Sonia");
		users.add("Priyanka");
		users.add("Modi");
		System.out.println(users);
		
		HashSet<String> emps=new HashSet<String>(100,0.8f);
		
		emps.add("Modi");
		emps.add("Amithshaw");
		System.out.println(emps);
		//union operation set object
		//users.addAll(emps);
		//System.out.println(users);
		
		//removeAll
		//users.removeAll(emps);
		//System.out.println(users);
		
		//intersection operation set
		users.retainAll(emps);
		System.out.println(users);
		
		
		
	}

}
