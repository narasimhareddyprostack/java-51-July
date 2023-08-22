interface Dao{
   //public static final int min_Bal; //initilization is required
   public              int min_Bal1 = 500;
   public static       int min_Bal2 = 500;
   public static final int min_Bal3 = 500;
   
}

class DaoImpl implements Dao{   
    min_Bal1 = 9900;
    public static void main(String[] args){
        System.out.println(Dao.min_Bal1);
        System.out.println(Dao.min_Bal2);
        System.out.println(Dao.min_Bal3);
        System.out.println(min_Bal1);
    }
}