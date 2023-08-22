package oopbasics;

public class Account {
	 private int acc_Id;
	 private String acc_Name;
	 private double acc_Bal;
	 private double min_Bal;
	public int getAcc_Id() {
		return acc_Id;
	}
	public String getAcc_Name() {
		return acc_Name;
	}
	public double getAcc_Bal() {
		return acc_Bal;
	}
	public double getMin_Bal() {
		return min_Bal;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	public void setAcc_Bal(double acc_Bal) {
		this.acc_Bal = acc_Bal;
	}
	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public double cal_Bal(){
		return this.acc_Bal - this.min_Bal;
	}
	 
}
