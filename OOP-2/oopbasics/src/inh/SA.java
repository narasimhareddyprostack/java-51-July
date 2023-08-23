package inh;

public class SA extends Account{
	private double min_Bal;
	//generate setters and getters

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public double cal_Bal(){
	//business logic
	double bal=this.getAcc_Bal() - this.getMin_Bal();
	return bal; 
	}
}
