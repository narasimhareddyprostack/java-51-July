class Test{
     int a =100;  // non static variable ie instance
    public static void main(String[] args){
        Test  t1 = new Test();
        Test  t2 = new Test();
        System.out.println(t1.a); //100
        System.out.println(t2.a); //100

        //update instance variable 
        t2.a=10;
        System.out.println(t1.a); //100
        System.out.println(t2.a); //10

    }
}