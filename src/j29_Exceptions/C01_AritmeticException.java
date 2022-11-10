package j29_Exceptions;

import java.util.Scanner;

public class C01_AritmeticException {
    public static void main(String[] args) {
        //AritmeticException Matameticsel işlemlerde oluşan RTE Exception1
        String str = "";
        // str.charAt(2)  ;//RTE
        Scanner sc = new Scanner(System.in);
        System.out.println("agam 1. sayı giresen: ");
        int sayi1 = sc.nextInt();
        System.out.println("agam 2. sayı giresen: ");
        int sayi2 = sc.nextInt();
        int oran ;

        try {//dene:hatanın olma ihtimali old code block
            /*
            1- try-catch kullanıldığında try block hatasız çalışırsa catch block asla çalışmaz catch block try block
            exception hata yakalrsa çalışır
            2-try block catch veya finally block olmadan CTE verir .try block tan sonra birden fazla catch blok tanımlanabilir
            aynı anda sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent -child ilişkisi olan catch lerde child önce yazılmalı aksi halde CTE

             */
            oran = sayi1 / sayi2;//try block da hata yakalandıgı satırdan sonra try diğer satırlar değil ilgili catch block çalışır
            System.out.println(oran);
             }
            catch(ArithmeticException falanFilan){
                System.out.println("agam bölmede bolen 0 olmaz"+falanFilan.getMessage());//Exception oluştuğundaa sadece hata msjı print eden
                falanFilan.printStackTrace();//oluşan exception tüm detay bilgisi print etmek için kullanılır
                System.out.println("agam cırak catch den selamlar");
            }
            catch(ArrayIndexOutOfBoundsException arrayExc){
                System.out.println("agam array de olmayan eleman istersen");
            }

             catch (Exception ebikgabık) {//Exception class tum exceptionların haz. Adem parent class->bad practice
            //hata yakalandığında yapılacak aksiyonların olduğu block
            System.out.println("Agam 0 hiç böler mi :");
            //Exception :olusan hata datatype
                 //ebikGabık:javanın oluşan exception a atayacağo obj nama best practice
        }
        finally{//catch bloclardan sonra istenirse finally block kullanılabilir
                /*
                try-catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally tanımlanır
                hata durumunda catch çalişmazsa pr sonlanır ama finally tanımlanırsa catch çalişmasa bile
                pr akişi devam eder.finally block hata olsa da olmasa da çalişir
                cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdığınızda code başrılı bir
                 şekilde çalısırsa işlem bittiğinde finlly block ile connection kapanmazsa maliyet pahalı olur.

                 */
                System.out.println("agam finally blocdan selamlar");
            }
       // catch (ArithmeticException falanFilan){//child exception parent exception (Exception ebikGabık)den sonra
        System.out.println("Agam selametle");//pr sonuna kadar çalıştı mesaj
    }
}