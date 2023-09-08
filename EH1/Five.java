class Test{
    public static void main(String[] args){
        System.out.println("GM");
        int[] ids={101,202,303};
        try{
            System.out.println(ids[10]);
        }
        catch(Exception e){
              System.out.println(ids[0]);
            e.printStackTrace();
           /*  System.out.println(e);
             System.out.println(e.getMessage()); */
        }
       
        
        System.out.println("GE");
    }
}