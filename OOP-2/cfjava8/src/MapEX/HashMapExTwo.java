package MapEX;

import java.util.HashMap;

public class HashMapExTwo {

	public static void main(String[] args) {
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(101, "Rahul");
		emp.put(102, "Sonia");
		emp.put(103, "Priyanka");
		emp.put(104, "Mdoi");
		emp.put(105, "A Shaw");
		emp.put(106, "Rajni");
		emp.put(106, "Vijay");
		emp.put(null, null);
		emp.put(null, null);
		System.out.println(emp);

	}

}
