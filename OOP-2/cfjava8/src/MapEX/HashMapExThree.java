package MapEX;

import java.util.HashMap;

public class HashMapExThree {

	public static void main(String[] args) {
		HashMap<String,String> emp=new HashMap<String,String>();
		emp.put("id","101");
		emp.put("id","102");
		emp.put("name","Rahul");
		emp.put("sal","45000.00");
		emp.putIfAbsent("salary", "550000.00");
		System.out.println(emp);

	}

}
