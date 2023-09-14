package cfone;

import java.util.ArrayList;

public class ArrayListFive {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add("Rahul");
		al1.add(45000.00);
		al1.add(true);
		al1.add(null);
		al1.add(10);
		
		System.out.println(al1);
		System.out.println(al1.size());
		
		//iterate arraylist and display elements
		
		//for(){},while(){},do{}while(),forEach(),using iterator
		/*
		for(int i=0;i<=al1.size()-1;i++) {
			System.out.println(al1.get(i));
		}
  		*/
		int i=0;
		while(i<=al1.size()-1) {
			System.out.println(al1.get(i));
			i++;
		}
	}

}
