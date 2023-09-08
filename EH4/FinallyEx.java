class Test{
    public static void main(String[] args) throws InterruptedException{
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
             System.out.println(10/2);
        }
        
        finally{
            System.out.println("finally block will execute always");
        }
    }
}