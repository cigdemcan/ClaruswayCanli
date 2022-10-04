package j08_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
        int krmYas = 45;
        int ismlYas = 63;
        if (krmYas == ismlYas) {
        System.out.println("aynı yasdasınız güzel insanlar");
        System.out.println("yoksa siz ikiz misiniz");
    }
     if(krmYas>=40) {
         System.out.println("krm bey olgunluk yasındasınız");
         //if blok da{} kullanılmazsa ilk; kadar olan komut çalşır
         System.out.println("bu yazıyı okuduysanız 12. satırdaki if den bağımsız");
     }
     if(krmYas+ismlYas>100)
        {
            System.out.println("krm bey ve isml bey yaşları toplamı 100 den buyuk");
        }
        System.out.println("selam javacanlar");
       //ctrl+alt+l-->code reformat java format
        /*Bağımsız if statement yapıları sadece kendi scop(kapsamlarını) run eder.
        Birden fazla bağımsız if statement yapıları hepsinin bady çalışabileceği gibi hiçbirisini de bady de çalışmayabilir
         */
    }

}
