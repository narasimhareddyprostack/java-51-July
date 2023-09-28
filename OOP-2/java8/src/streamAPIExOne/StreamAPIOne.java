package streamAPIExOne;

import java.util.ArrayList;

public class StreamAPIOne {

	public static void main(String[] args) {
	ArrayList<String>	enames=new ArrayList<String>();
	ArrayList<String>	new_Names=new ArrayList<String>();
	enames.add("rahul");
	enames.add("sonia");
	enames.add("modi");
	enames.add("rajni");
	enames.add("nayana");
	enames.add("sharuk");
	enames.add("mahesh");
	enames.add("ankith");
	enames.add("rahul2");
	enames.add("praveen");
	
	//dispaly employee names start with 'r'
	/*
	for(String ename:enames) {
		if(ename.startsWith("r")) {
			System.out.println(ename);
		}
	}
	*/
	
	for(String ename:enames) {
		if(ename.startsWith("r")) {
			new_Names.add(ename);
		}
	}
	System.out.println(new_Names);
	}

}
