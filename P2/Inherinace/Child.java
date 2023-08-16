class Child extends Parent{
    void m3(){
        System.out.println("Child class -m3() method");
    }
    public static void main(String[] args){
            Parent obj1= new Parent();
            //obj1.m1();
            //obj1.m2();
            Child obj2 = new Child();
            //obj2.m1();
            //obj2.m2();
            //obj2.m3();
            Parent obj3= new Child();
            obj3.m1();
            obj3.m2();
            obj3.m3();
            //Child obj4 = new Parent();

    }
}