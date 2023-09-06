class Test{
    public static void main(String[] args){
        System.out.println("GM");
        
        try{
            String ename1 = "Rahul Gandhi";
            String ename2=null;
            System.out.println(ename1.length());
            System.out.println(ename2.length());
             
        }
        catch(Exception e){
           
             e.printStackTrace();
           /*  System.out.println(e);
             System.out.println(e.getMessage()); */
        }
       
        
        System.out.println("GE");
    }
}