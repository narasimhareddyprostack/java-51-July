package pack1;
public class A{
        public void m1(){
            System.out.println("pack1 - public Class A - m1() ie public");
        }
        void m2(){
            System.out.println("pack1 - public Class A - m2() ie default");
        } 
        private void m3(){
            System.out.println("pack1 - public Class A - m3() ie private");
        }
        protected void m4(){
            System.out.println("pack1 - public Class A - m4() ie protected");
        }

}