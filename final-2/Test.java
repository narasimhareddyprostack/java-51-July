class Dao{
      final void m1(){
            System.out.println("Dao Class - m1 method");
        }
}
class Test extends Dao{
        void m1(){
            System.out.println("Test Class - m1 method");
        }
    public static void main(String[] args){
        new Test().m1();
    }
}