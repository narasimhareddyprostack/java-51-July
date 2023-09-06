class Test{
    public static void main(String[] args){
        System.out.println("GM");
        
        try{
            int number=Integer.parseInt("ten");
            System.out.println(number);
             
        }
        catch(Exception e){
             int number=Integer.parseInt("100000");
             System.out.println(number);
             e.printStackTrace();
           /*  System.out.println(e);
             System.out.println(e.getMessage()); */
        }
       
        
        System.out.println("GE");
    }
}