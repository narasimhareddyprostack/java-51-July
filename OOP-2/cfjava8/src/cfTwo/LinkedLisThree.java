package cfTwo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLisThree {

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
		
		int i=0;
		while(i<=enames.size()-1) {
			System.out.println(enames.get(i));
			i++;
		}
	}

}
