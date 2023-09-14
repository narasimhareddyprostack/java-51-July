package cfset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HastSetFour {

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
		Collections.sort(enames);
		
	}

}
