package j18_Constructor;

public class C01_Constructor {

        /*
        1- consturctor ismi Calss bame ile aynı olmalı.Buyuk harf ile baslamı
        2-constructor creta edildiğinde name den sonra () {} mutlaka kullanılmalı
        3-eger p`licons. create edildiğinde java default cons ezer(siler)
        4-cons.return type olmaz methoddan ayıran özelliğidir
        5-Class luştuğunda java default cons. kendi create eder.
         */
    String str;//inst variable -> obj variable
    String selam="güzel insan";
   // C01_Constructor obj1=new C01_Constructor();
        public static void main(String[] args) {
           //class name         obje name      new keyword    default cons.
         C01_Constructor         obj1    =       new    C01_Constructor();
         C01_Constructor         obj2    =       new     C01_Constructor();
         C01_Constructor         obj3    =       new     C01_Constructor();
         C01_Constructor         obj4   =       new      C01_Constructor();
         obj1.str="javacan";
         obj2.str="javatar";
            System.out.println(obj3.selam);//"guzel insan"
            System.out.println(obj1.str);//javacan
            System.out.println(obj2.str);//javatar
            System.out.println(obj4.str);//null
            obj3.aga();//agama selamke
            obj2.aga();//agama selamke
        }//main sonu
        public  void aga(){
            System.out.println("agaya selamke");
        }
}
