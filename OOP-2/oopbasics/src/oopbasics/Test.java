package oopbasics;

public class Test {
	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka");
		a2.setAcc_Bal(8000000);
		a2.setMin_Bal(5000);
		
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul");
		a1.setAcc_Bal(10000.00);
		a1.setMin_Bal(500.00);
		
		/*
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul");
		a1.setAcc_Bal(500001.00);
		a1.setMin_Bal(500.00);
		
		System.out.println("Account Id:"+a1.getAcc_Id());
		System.out.println("Account Name:"+a1.getAcc_Name());
		System.out.println("Account Bal:"+a1.getAcc_Bal());
		System.out.println("Min Bal"+a1.getMin_Bal());
		
		double bal = a1.cal_Bal();
		System.out.println(bal);
	   */
		
		System.out.println(a1.cal_Bal());
		System.out.println(a2.cal_Bal());
	}
}
