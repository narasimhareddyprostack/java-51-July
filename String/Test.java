class Emp{

}
class Test{
    public static void main(String[] args){
            Emp e1=new Emp();
            Emp e2=new Emp();

            System.out.println(e1.toString());  //Emp@hexa145
            System.out.println(e2.toString());  //Emp@hexa178

            System.out.println(e1.equals(e2));
              
    }
}