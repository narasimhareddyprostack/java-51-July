class Test{
    public static void main(String[] args){
        System.out.println("GM");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
             System.out.println(10/5);
        }
       
        
        System.out.println("GE");
    }
}