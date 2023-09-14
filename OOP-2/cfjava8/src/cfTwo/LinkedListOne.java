package cfTwo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {
		new ArrayList<String>();
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Proyanka");
		enames.add("Modi");
		enames.add("Amith");
		enames.add("Vijay");
		enames.add("Seetupathi");
		
		System.out.println(enames);
		enames.removeFirst();
		System.out.println(enames);
	}

}
