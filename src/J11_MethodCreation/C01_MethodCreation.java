package J11_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {//main method başı
          /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/
        System.out.println("javacanlara slm olsun");
        topla();//parametresiz return type olmayan void bir method

        System.out.println("agam bu yazıyı okuduysan ahan da yukarıdaki method coll oldu");

     topla2(34,43);

int maaş=topla3();
        System.out.println(maaş);//135
        System.out.println("ahan da topla3 çalıştı");

    }//main kapanış


    public static void topla() {//parametresiz return type olmayan void bir method
        int a = 33;
        int b = 23;
        System.out.println(a + b);
        System.out.println("topla methodundan selamlar");


    }
    public static void topla2(int a ,int b) {//parametreli(2int)voit
        System.out.println("bu method paremetreli");
        System.out.println(a+b);
        System.out.println("topla2 çalıştı");


    }

    public static int topla3() {//parametresiz int return eder

        int a = 72;
        int b = 63;
        return a + b;

    }

}//class kapanış
