package defautlconst;

class Parent{
	Parent(String name){
		System.out.println("Parent Class - const");
	}
}
class Child extends Parent{
	Child(){
		super("Rahul");
		System.out.println("Child Class - const");
	}
}

public class SuperEx {

	public static void main(String[] args) {
		new Child();
	}

}
