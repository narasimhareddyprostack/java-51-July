package defaultmethods;

public interface ConnnetI {
	void m1();
	void m2();
	default void m3() {
		System.out.println("ConnectI - interface m3 method");
	}
}
