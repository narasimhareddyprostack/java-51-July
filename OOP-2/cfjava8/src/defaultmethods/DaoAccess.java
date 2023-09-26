package defaultmethods;

public interface DaoAccess {
	void login();
	void logout();
	//How to enhance interface functionality
	default void forgetPassword() {
		System.out.println("inside interface - forget password method");
	};
}
