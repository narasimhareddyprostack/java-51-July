class A{
    public void m1(){
        System.out.println("public method ie m1()");
    }
    void m2(){
        System.out.println("Default method ie m2()");
    }
    private void m3(){
        System.out.println("private method ie m3()");
    }
    protected void m4(){
        System.out.println("protected method ie m4()");
    }
    public static void m5(){
        System.out.println("public static method ie m5()");
    }
    public static void main(String[] args){
        A a=new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        
        a.m5();
        A.m5();
        m5();
    }
}