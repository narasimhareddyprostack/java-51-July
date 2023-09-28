package streamAPIExOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIThree {

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
	
	List<String>  new_Names=enames.stream().filter(ename->ename.startsWith("r"))
	               .collect(Collectors.toList()); 
	
	System.out.println(new_Names);
	}

}
