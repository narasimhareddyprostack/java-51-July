package cfone;

import java.util.ArrayList;

public class ArrayListThree {

	public static void main(String[] args) {
		ArrayList enames=new ArrayList();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priynka");
		enames.add("Modi");
		enames.add("Sharuk");
		enames.add("Nayana");
		System.out.println(enames);
		//print enames 
		//arraylist - indexing is application
		//for(){}, while(){},do{}while(), foreach
		
		for(Object ename:enames) {
			System.out.println(ename);
		}
		

	}

}
