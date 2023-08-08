class Test{
    static int a=100;
    int b=200;

    public static void main(String[] args){
      int c=300;
       Test t1=new Test();
       Test t2=new Test();

       System.out.println(a+t1.b+c);//600
       //                 100+200+300    


       t1.a = 1;
       t2.a = 19;
       System.out.println(t1.a+t2.a+a+Test.a);//76
                          //19+19+19+19

       a = 2;
       System.out.println(a+t1.a+c);//304
       //                 2 + 2 + 300
    }
}