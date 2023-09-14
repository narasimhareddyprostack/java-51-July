interface Account{
    int min_Bal=500;
}
class Test implements Account{
    public static void main(String[] args){
        Account.min_Bal = 600;  
        System.out.println(Account.min_Bal);  
    }
}