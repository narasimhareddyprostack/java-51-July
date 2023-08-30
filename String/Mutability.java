class Test{
    public static void main(String[] args){
        String s1=new String("Rahul");

        StringBuffer s2= new StringBuffer("Rahul");

        s1.concat("Gandhi");
        s2.append("Gandhi");

        System.out.println(s1); //Rahul
        System.out.println(s2); //RahulGandhi

    }
}