abstract class Calc{
    public abstract int cal_Age();  // only method declartion
}

//child class is  resposbile to provide impl
class Calc_Impl extends Calc{
        public int cal_Age(){
        
        return 40;
        }
}

public class Test{
        public static void main(String[] args){
              int age =   new Calc_Impl().cal_Age();
              System.out.println(age);
        }
}