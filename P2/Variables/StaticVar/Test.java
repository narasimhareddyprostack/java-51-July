class Account{
    static int min_Bal = 500;
    public static void main(String[] args){
        
       Account a1= new Account();
       Account a2= new Account();

        System.out.println(min_Bal);

        //using instance or object
        System.out.println(a1.min_Bal);
        System.out.println(a2.min_Bal);

        //using claass name
        System.out.println(Account.min_Bal);

        min_Bal = 20000;
        a1.min_Bal = 15000;
        Account.min_Bal = 25000;
        System.out.println(min_Bal);
    }
}