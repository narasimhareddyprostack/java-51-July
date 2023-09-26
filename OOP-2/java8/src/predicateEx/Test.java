package predicateEx;

import java.util.function.Predicate;

@FunctionalInterface	
interface PredicteIOne{
	public abstract boolean test(int num);
}
public class Test {
  static	Predicate<Integer> t1=num->num>100;
   static PredicteIOne t2 = (int num)->{
	   if(num > 100) {
		   return true;
	   }
	   else {
		   return false;
	   }
	   
   };
	
	public static void main(String[] args) {
		
		System.out.println(t1.test(10));
		
	}

}
