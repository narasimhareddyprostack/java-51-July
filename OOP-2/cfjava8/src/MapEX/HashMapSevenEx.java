package MapEX;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSevenEx {

	public static void main(String[] args) {
	HashMap<String,String>	user=new HashMap<String,String>();
	user.put("id", "101");
	user.put("name", "rahul");
	user.put("salary", "45000.00");
	user.put("loc", "wayanad");
	System.out.println(user);
	
	Set<Entry<String,String>> entris=user.entrySet();

	}

}
