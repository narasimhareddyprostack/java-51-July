class Parent{
        public String m1(){
            return "Parent class -m1 method";
        }
}
class Child extends Parent{
   /*   public String m1(){
            return "Child class -m1 method";
     } */
      public String m2(){
            return "Child class -m2 method";
        }
    public static void main(String[] args){
       Child c1=new Child();
        System.out.println(c1.m1());
        System.out.println(c1.m2());


    }
}