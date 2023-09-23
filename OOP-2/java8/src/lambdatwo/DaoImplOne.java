package lambdatwo;

public class DaoImplOne {
	static DaoI obj=()->{ System.out.println("Login Success"); };
	
	public static void main(String[] args) {
		obj.login();
		
	}

}
