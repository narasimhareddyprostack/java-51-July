class A{
    public void m1(){
        System.out.println("public method ie m1()");
    }
    public static void main(String[] args){
        A a=new A();
        a.m1();
        Object b=new A();
        b.m1();
        System.out.println(a);
        System.out.println(b);
    }
}