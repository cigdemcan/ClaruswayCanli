package day06;

import java.util.Scanner;

public class Q04_ForLoop {
    /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1 den buyuk bir tam sayı giriniz");
        int sayı=sc.nextInt();
        int kareToplam=0;
        for(int i=1; i<sayı; i++){
            kareToplam +=i*i;
        }
        System.out.println("kare toplam:"+kareToplam);
    }
}
