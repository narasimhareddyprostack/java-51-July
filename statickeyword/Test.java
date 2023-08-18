interface Dao{
   //public static final int min_Bal; //initilization is required
     int min_Bal = 500;
   
}

class DaoImpl implements Dao{   
    static int min_Bal = 9900;
    public static void main(String[] args){
      
       
        System.out.println(Dao.min_Bal);
    }
}