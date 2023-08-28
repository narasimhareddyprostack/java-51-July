package defautlconst;

public class Employee {
	int eId;
	String eName;
	String org_Name = "TCS";
	public Employee(int id, String name) {
		//System.out.println("First Parent Class - const will execute");
		this.eId=id;
		this.eName=name;
	}
}
