package pillers;

public class CA extends Account {
	private double min_Bal;
	//generate settes and getters

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void cal_Bal(){
		double bal = this.getAcc_Bal() - getMin_Bal();
		System.out.println(bal);
	}
	
}