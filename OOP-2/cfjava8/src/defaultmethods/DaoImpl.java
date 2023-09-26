package defaultmethods;

public class DaoImpl implements DaoAccess {
	
	public  void forgetPassword() {
		
		System.out.println("Inside DaoImple class - forgetPassword");
		//DaoAccess.super.forgetPassword();
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		DaoImpl	obj=new DaoImpl();
		obj.login();
		obj.logout();
		obj.forgetPassword();
			
	}

}
