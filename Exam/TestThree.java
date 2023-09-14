class Test{
    public static void main(String[] args){
        try{
            System.out.println( 10/0); 
        }
        catch(NullPointerException ae){
            ae.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
       
        
     
    }
}