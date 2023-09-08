class InsuffientFundsEx extends Exception{
        InsuffientFundsEx(String msg){
            super(msg);
        }
}

//new InsuffientFundsEx("Low Balance")