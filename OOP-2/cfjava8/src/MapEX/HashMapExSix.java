package MapEX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExSix {

	public static void main(String[] args) {
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(101, "Rahul");
		emp.put(102, "Sonia");
		emp.put(103, "Priyanka");
		emp.put(104, "Mdoi");
		emp.put(105, "A Shaw");
		emp.put(106, "Rajni");
		System.out.println(emp);
		
		Set<Entry<Integer,String>> entries=emp.entrySet();
		System.out.println(entries);
		
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> entry= (Entry) itr.next();
			System.out.println(entry.getKey() +":"+ entry.getValue());
		}
	}

}
