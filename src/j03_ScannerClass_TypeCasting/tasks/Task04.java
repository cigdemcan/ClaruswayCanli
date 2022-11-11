package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("isim,soyisim,yas,kilo,boy,devam edecegi ay suresini giriniz");
        String isimSoyisim=sc.nextLine();
        int yas=sc.nextInt();
        int boy=sc.nextInt();
        int kilo=sc.nextInt();
        int aySure=sc.nextInt();
        int toplamUcret=aySure*20;
        System.out.println("$"+toplamUcret);
    }
}
