class Parent{
           protected void m1(){
            System.out.println("Protected method - m1");
           }
           private void m2(){
               System.out.println("Private method - m2");
           }
}
class Child extends Parent{
    void m3(){
    System.out.println("Child class -Defualt method - m3");
    }
    public static void main(String[] args){
        Parent a=new Parent();
        //a.m1();
        //a.m2();
        Child b=new Child();
        //b.m1();
        //b.m2();
        //b.m3();
        Parent c=new Child();
        c.m1();
        //c.m2();
        c.m3();
        //Child d=new Parent();
    }
}