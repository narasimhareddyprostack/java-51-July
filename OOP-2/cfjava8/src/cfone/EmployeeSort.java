package cfone;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Proyanka");
		enames.add("Modi");
		enames.add("Amith");
		enames.add("Vijay");
		enames.add("Seetupathi");
		
		System.out.println(enames);
		Collections.sort(enames);

		System.out.println(enames);
	}

}
