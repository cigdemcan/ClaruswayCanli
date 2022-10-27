package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08_Arrays {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine().toLowerCase().trim().replace(" ", "");

        List<String> name = new ArrayList<>(List.of("ramazan", "özlem", "merve", "feray", "çiğdem"));

        if (!name.contains(isim)) {
            System.out.println(isim);
            name.add(isim);
            System.out.println(name);
        }
        else{
            System.out.println(isim +(int)(Math.random()*100));

        }


}}
