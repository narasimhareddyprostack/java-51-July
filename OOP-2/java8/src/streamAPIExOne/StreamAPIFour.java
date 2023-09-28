package streamAPIExOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIFour {

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
	//convert employee names to uppercase 
	
	/*
	for(int i=0;i<=enames.size()-1;i++){
		System.out.println(enames.get(i).toUpperCase());
	}
	*/
	/*
	enames.stream().map(ename->ename.toUpperCase())
	               .forEach(name->System.out.println(name));
	*/
	//convert into uppercase and collect
	List new_Names =enames.stream().map(ename->ename.toUpperCase())
	               .collect(Collectors.toList());
	System.out.println(new_Names);
	}

}
