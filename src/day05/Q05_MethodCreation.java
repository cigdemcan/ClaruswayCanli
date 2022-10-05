package day05;

import java.util.Scanner;

public class Q05_MethodCreation {
    static Scanner sc = new Scanner(System.in);
    //Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz
    public static void main(String[] args) {
        System.out.println("kaç sayı toplamak istiyorsunuz");
        int adet = sc.nextInt();
if(adet<2){
    System.out.println("en az iki sayı girmelisin");
} else if (adet==2){
    ikiSayiTopla();
} else if (adet==3) {
    boolean ucSayiTopla;
    System.out.println(ucSayiTopla());
} else if (adet==4) {
    dörtSayiTopla();

}else System.out.println("çok sayı girdiniz,ben toplayamam");
    }
    private static double ucSayiTopla() {
        System.out.println("üç sayı giriniz");
        double sayi1=sc.nextInt();
        double sayi2=sc.nextInt();
        double sayi3=sc.nextInt();
        return sayi1+sayi2+sayi3;
    }
    private static void dörtSayiTopla() {
        System.out.println("dört sayı giriniz");
        double sayi1=sc.nextInt();
        double sayi2=sc.nextInt();
        double sayi3=sc.nextInt();
        double sayi4=sc.nextInt();
        System.out.println("4 sayının toplamı:"+(sayi1+sayi2+sayi3+sayi4));
    }
    private static void ikiSayiTopla() {
        System.out.println("iki sayı giriniz");
        double sayi1=sc.nextInt();
        double sayi2=sc.nextInt();
        System.out.println("iki sayının toplamı"+(sayi1+sayi2));
    }
}