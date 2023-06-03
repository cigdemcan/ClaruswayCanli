package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
        concat() methodu içine aldığı string varible ı çalıştığı stringin sonuna ekler
        Java da + işlemi yaoılırken eğer en az bir string varible varsa java toplama değil concat yapar.
         */

      String name="Nur" ;
      String meslek="Qa tester";
        System.out.println("name.concat(meslek) = " + name.concat(meslek));
        // System.out.println(name.concat(meslek));//Nur Qa tester
        System.out.println(name);//Nur
        //TRİCK->String methadları variable geçici değişiklik yapar.
        //ama değişken atama yapılırsa kalıcı değişir.
        name=meslek.concat(name);
        System.out.println("name=" + name);//Qatester Nur

        System.out.println(name.concat(true +":)"));//Qa tester Nurtrue :)
        System.out.println(name.concat(100 +":)"));//Qa tester nur 100 :)
        //TRICK->concat methodu paremetre olarak string type harici tüm dataları strine çevirip concate eder.






    }
}
