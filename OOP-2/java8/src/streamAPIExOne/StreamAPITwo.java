package streamAPIExOne;

import java.util.ArrayList;

public class StreamAPITwo {

	public static void main(String[] args) {
	ArrayList<String>	enames=new ArrayList<String>();
	
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
	
	enames.stream().filter(ename->ename.startsWith("r"))
	               .forEach(name->System.out.println(name));  
	
	}

}
