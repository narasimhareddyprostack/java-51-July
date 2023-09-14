package cfone;

import java.util.ArrayList;

public class ArrayListSix {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("AmithShaw");
		//iterate arraylist and print
		for(String ename:enames) {
			System.out.println(ename);
		}
		System.out.println(enames.size());
		

	}

}
