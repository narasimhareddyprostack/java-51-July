interface InterF{
    int a = 100;
    //void m1();
}
class Test implements InterF{
    //static int a=200;//instance var
public static void main(String[] args){
    System.out.println(InterF.a);
    System.out.println(a);
}
}