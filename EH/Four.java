class Test{
    public static void main(String[] args){
        System.out.println("GM");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
             e.printStackTrace();
             System.out.println(e);
             System.out.println(e.getMessage());
        }
       
        
        System.out.println("GE");
    }
}