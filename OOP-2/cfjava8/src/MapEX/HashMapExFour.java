package MapEX;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExFour {

	public static void main(String[] args) {
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(101, "Rahul");
		emp.put(102, "Sonia");
		emp.put(103, "Priyanka");
		emp.put(104, "Mdoi");
		emp.put(105, "A Shaw");
		emp.put(106, "Rajni");
		System.out.println(emp);
		//print all keys
		//print all values
		//print all entris
		
		Set<Integer> keys=emp.keySet();
		Collection<String> values=emp.values();
		/*
		for(Integer key:keys) {
			System.out.println(key);
		}
		*/
		/*
		for(String value:values) {
			System.out.println(value);
		}
		*/
	}

}
