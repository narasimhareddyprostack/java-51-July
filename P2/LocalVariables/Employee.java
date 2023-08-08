class Employee{
    //instance var, static var
    int id = 100;
    String ename ;
    static String org_Name;
    
    static void get_Details(){
     int a =200; //local variable
     Employee e1 =  new Employee();
     Employee e2  = new Employee();

     System.out.println(e1.id);  //100
     System.out.println(e1.ename);//null
     
     System.out.println(org_Name);//null
     System.out.println(a);//200
    }
    public static void main(String[] args){
    get_Details();
    }
}