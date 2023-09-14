package cfset;

import java.util.HashSet;
import java.util.Iterator;

public class HastSetThree {

	public static void main(String[] args) {
		new HashSet(100);
		//creating hashset object with capacity 100
		//fill ratio/load factor ie  0.75f 
		HashSet<String> enames=new HashSet<String>(100,0.8f);
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Rahul");
		enames.add("Priyanka");
		enames.add("Priya");
		System.out.println(enames);
		//iterate hashset object - using foreach and iterators
		/*
		for(String ename:enames) {
			System.out.println(ename);
		}*/
		
		Iterator itr=enames.iterator();
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
		
	}

}
