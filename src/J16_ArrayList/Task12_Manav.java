package  J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        Scanner sc=new Scanner(System.in);
        int secim;
        double kilo;
         double toplamTutar = 0;
         boolean devamMı=true;
         double fiyat[]={15,20,25,24,26};
         while (devamMı){
        String urun []={"1-Domates", "2-Salatalik","3-Kabak", "4-Elma", "5-Portakal"};
        System.out.println("lutfen almak istediğiniz urunu no giriniz");
        secim=sc.nextInt();
        System.out.println("almak istediğiniz kg giriniz");
        kilo=sc.nextDouble();
        toplamTutar+=kilo*fiyat[secim];
        System.out.println("baska urun alamk istiyor musunuz evet için 1 hayır için 2 :");
       secim=sc.nextInt();
      if(secim==2) devamMı=false;


        System.out.println("toplamTutar = " + toplamTutar);
    } }}