package inh;

public class Test {

	public static void main(String[] args) {
		SA a1=new SA();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul");
		a1.setAcc_Bal(50000.00);
		a1.setMin_Bal(500);
	    double bal=a1.cal_Bal();
	    
	    System.out.println(bal);
	    
	    CA a2=new CA();
	    a2.setAcc_Id(102);
	    a2.setAcc_Name("Sonia");
	    a2.setAcc_Bal(6000);
	    a2.setMin_Bal(25000);
	  
	    System.out.println(a2.cal_Bal());
	    
	    
		
	}

}
