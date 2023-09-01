package langex;

public class AutoBoxingEx {

	public static void main(String[] args) {
		int a = 100;
		Integer b = a;
		int c = b;
		
		String rating1 = new String("4");
						
		int rating2 = Integer.parseInt(rating1);
		float rating3 = Float.parseFloat(rating1);
		double rating4 = Double.parseDouble(rating1);
		
		System.out.println(rating2);
		System.out.println(rating3);

	}

}
