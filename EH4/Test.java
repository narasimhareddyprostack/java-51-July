class InsuffientFundsEx extends Exception{
        InsuffientFundsEx(String msg){
            super(msg);
        }
}

class Account{
    public void withdrawl(int amount) throws InsuffientFundsEx{
        int bal=60000;
        if(bal < amount){
            throw new InsuffientFundsEx("Low Balance");
        }else{
            System.out.println("Enjoy");
        }
        //System.out.println("GA");
       
    }
    public static void main(String[] args) throws InsuffientFundsEx{
       /*  Account a1=new Account();
        a1.withdrawl(); */
        new Account().withdrawl(500);
        
    }
}