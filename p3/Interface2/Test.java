interface A{
    public abstract void m1();
}
interface B{
    public abstract void m2();
}

class Test implements A,B{
           public void m1(){
            System.out.println("m1 method");
           }
           public void m2(){
            System.out.println("m2 method");
           }

           public static void main(String[] args){
            Test obj=new Test();
            obj.m1();
            obj.m2();
           }
}

//multiple inheritance not possbile?
//Every java class - parent class is Object Class.
