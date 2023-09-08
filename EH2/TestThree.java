class Test{
    public static void main(String[] args){
        System.out.println("GM");
        try{
             //System.out.println(10/0);
            throw new ArithmeticException("Can't Devide by Zero");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("GA");
      
    }
}