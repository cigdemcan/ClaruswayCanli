package j10_StringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class Tasködev3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //task1
   /*  I love java olan bir String oluşturun.
   Bu cümlenin toplam karakter sayısını yazdırın.   */

        String a = scan.nextLine();
        System.out.println(a.length());
  //task2
   /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        String b = "Sprint planning";
        System.out.println(b.length());

        //task3
    /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */
        String c = "paper";
        System.out.println(c.toUpperCase());

        //task4
/* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */
        String d = "OraNge";
        System.out.println(d.toLowerCase());

        //task5
 /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */

        String e = "New Jerşey";
        System.out.println(e.toUpperCase());

        //task6

  /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */
        String f = "New York";
        System.out.println(f.toLowerCase());

        //task7
          /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */
        String g = "PADDLE";
        System.out.println(g.toLowerCase());

        //task8
  /*  apple olan bir String oluşturun.
        String'in içinde app olup olmadığını doğrula.   */
        String h = "apple";
        System.out.println(h.contains("app"));

        //task9
       /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */
        String i = "orange";
        System.out.println(i.equals("apple"));

        //task10
 /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        String k = "apple";
        System.out.println(k.equalsIgnoreCase("Apple"));

        //task11
        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        String m = "Florida";
        System.out.println(m.indexOf('o'));

//task12
         /*  Thank you olan bir String oluşturun.
            Thank you içindeki, sadece  'y' harfinin bulunduğu konumu yazdırın.
            // Thank you Stringini oluşturun.  */

        String n = "Thank you";
        System.out.println(n.indexOf("y"));

        //task13
           /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */
        String o = "Clarus  Way";
        System.out.println(o.trim());

        //task14
          /*
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        String p = "Mouse";
        System.out.println(p.charAt(2));


//task15
    /*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */
        String s1 = "   Chocolade     ";
        System.out.println(s1.trim());

//task16
  /*
        Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
                ad ayrı soyad ayrı sekilde ekrana yazdırınız.*/

        System.out.println("adınızı ve soyadınızı girin");
        String adsoyad = scan.nextLine();
        String ad = adsoyad.substring(0, adsoyad.indexOf(" "));
        String soyad = adsoyad.substring(adsoyad.indexOf(" ") + 1);
        System.out.println("ad=" + ad);
        System.out.println("soyad=" + soyad);

          //task17
    /*kullanıcıdan alacagınız 3 kelimelik ismi örn:Ali Mert Yılmaz ->A.M.Y.şeklinde print eden code create ediniz*/
        System.out.println("1.adınızı girin");
        String ilkad=scan.nextLine();
        System.out.println("2.adınızı girin");
        String ikinciad=scan.nextLine();
        System.out.println("soyadınızı girin");
        String soyAd=scan.nextLine();
        System.out.println(ilkad.substring(0,1).toUpperCase()+"."+ikinciad.substring(0,1).toUpperCase()+"."+soyAd.substring(0,1).toUpperCase()+".");

}
}