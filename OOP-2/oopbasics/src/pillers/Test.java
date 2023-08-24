package pillers;

public class Test {
public static void main(String[] args) {
	SA a1=new SA();
	a1.setAcc_Id(101);
	a1.setAcc_Name("Rahul");
	a1.setAcc_Bal(15000.00);
	
	a1.setMin_Bal(500);
	CA a2=new CA();
	
	a2.setAcc_Id(102);
	a2.setAcc_Name("Priyanka");
	a2.setAcc_Bal(55000.00);
	a2.setMin_Bal(25000);
	
	
	System.out.println("Rahul Gandhi Balance:");
	//a1.cal_Bal();
	AccountService.get_Service(a1);
	System.out.println("Rahul Gandhi Balance:");
	//a2.cal_Bal();
	AccountService.get_Service(a2);
}
}
