abstract class Dao{
        abstract void login(); //only decl means abstraction
        //  + 
        void logout(){
            System.out.println("Logout success");
        }  // concrete method
}
class Dao_Imp extends Dao{
  void  login(){ 
    System.out.println("Login success");
   }
}


class Test{
    public static void main(String[] args){
        Dao_Imp a=new Dao_Imp();
        a.login();
        a.logout();
    }
}