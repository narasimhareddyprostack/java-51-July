package defautlconst;

public class PE  extends Employee{
	int sal;
	String org_Name = "Tata Const Services";
	public PE(int id, String name, int sal) {
		super(id,name);
		//System.out.println("Second - Child Class - const will execute");
		this.sal = sal;
	}
	public void get_Details(){
		System.out.println(super.org_Name);
	}
	

}
