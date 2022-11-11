package j04_AritmeticOperators;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ciftlikteki inek sayısını giriniz");
        int inek= scan.nextInt();
        System.out.println("ciftlikteki koyun sayısını giriniz");
        int koyun= scan.nextInt();
        System.out.println("ciftlikteki tavuk sayısını giriniz");
        int tavuk= scan.nextInt();
        System.out.println("ciftlikteki toplam ayak saısı "+ ((inek*4)+(koyun*4)+(tavuk*2)));
    }

}
