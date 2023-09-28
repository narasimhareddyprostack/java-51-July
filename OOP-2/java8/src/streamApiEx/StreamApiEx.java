package streamApiEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEx {

	public static void main(String[] args) {
	List al=new ArrayList();
	al.add("10");
	al.add(100);
	al.add("Rahul");
	al.add(true);
	Stream s1= al.stream();
	s1.forEach((ele)->System.out.println(ele));
	}

}
