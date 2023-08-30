class Emp{}
class Test{
    public static void main(String[] args){
            int a =100;
            int b= 200;
            int c =100;

            Emp e1=new Emp();
            Emp e2=new Emp();
            
            String s1=new String("Rahul");
            String s2=new String("Rahul");
            String s3= "Rahul";
            String s4 = new String("Gandhi");
/* 
           System.out.println(a==b); //false
           System.out.println(a==c); //True */
           /* 
            System.out.println(e1 == e2);  //false
            System.out.println(e1.equals(e2)); //flase
             */
           /*   System.out.println(s1 == s2);    //false

             System.out.println(s1 == s3);   //fasle

              System.out.println(s1.equals(s2)); // true
              System.out.println(s1.equals(s3)); //true
              System.out.println(s1.equals(s4));  //false */

               System.out.println(s1==s4);
    }
}